package dictionary.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.*;
import java.lang.*;

public class DictionaryFromCSV {
    private final TreeMap<Character, TreeMap<String, String>> dictionary;
    public DictionaryFromCSV() {
        LinkedList<String> tmp = DictionaryFromCSV.readCSV();
        String[] str;
        dictionary = new TreeMap<>(charComparator());
        int count = 0;

        for (String it : tmp) {
            str = DictionaryFromCSV.parseLine(it);
            count += addDefinition(str);
        }
        System.out.println("Dictionary generation finished. Total : " + count);
    }

    private static LinkedList<String> readCSV() {
        LinkedList<String> csvLines = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(new File("src/dictionary/resources/muellerdict_words.csv"));

            while (scanner.hasNextLine())
                csvLines.add(scanner.nextLine());

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return csvLines;
    }

     private static String[] parseLine(String line) {
        String[] str = new String[2];
        StringBuilder tmp = new StringBuilder(line.length());
        CharacterIterator it = new StringCharacterIterator(line);

        while (it.current() != CharacterIterator.DONE && it.current() != ',') {
            tmp.append(it.current());
            it.next();
        }

        str[0] = tmp.toString();
        tmp.setLength(0);

        while (it.current() != CharacterIterator.DONE && it.current() != '"')
            it.next();

        while (it.current() != CharacterIterator.DONE) {
            tmp.append(it.current());
            it.next();
        }

        str[1] = tmp.toString();
        return str;
    }

    private static Comparator<Character> charComparator() {
        return new Comparator<>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        };
    }

    private static Comparator<String> strComparator() {
        return new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public void printTree() {
        for (Map.Entry<Character, TreeMap<String, String>> it:
        dictionary.entrySet()) {
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }

    public String findWord(String word) {
        return dictionary.get(word.charAt(0)).get(word);
    }

    public void startTranslate () {
        Scanner scn = new Scanner(System.in);
        String[] str = new String[2];
        str[0] = str[1] = "";
        String stop = "stopTranslate";
        while (!str[0].equals(stop)) {
            System.out.print("Enter word : ");
            str[0] = scn.nextLine();
            str[1] = findWord(str[0]);
            if (str[1] != null && !str[0].equals(stop))
                System.out.println(str[1]);
            else if (str[1] == null && !str[0].equals(stop)){
                System.out.print("Enter new definition : ");
                str[1] = scn.nextLine();
                addDefinition(str);
            }
        }

    }

    private int addDefinition(String[] str) {
        TreeMap<String, String> tmpTree;
        int counter = 0;

        if (!dictionary.containsKey(str[0].charAt(0))) {
            tmpTree = new TreeMap<>(strComparator());
            tmpTree.put(str[0], str[1]);
            dictionary.put(str[0].charAt(0),
                    tmpTree
            );
            counter++;
        }
        else {
            if (dictionary.get(str[0].charAt(0)).containsKey(str[0])) {
                dictionary.get(str[0].charAt(0)).put(str[0],
                        dictionary.get(str[0].charAt(0)).get(str[0]) + str[0] + str[1]);
            } else {
                dictionary.get(str[0].charAt(0)).put(str[0], str[1]);
                counter++;
            }
        }

        return counter;
    }
}
