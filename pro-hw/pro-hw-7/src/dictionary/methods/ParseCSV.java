package dictionary.methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.*;
import java.lang.*;

public class ParseCSV {
    private final TreeMap<Character, TreeMap<String, String>> dictionary;
    public ParseCSV() {
        LinkedList<String> tmp = ParseCSV.readCSV();
        String[] str;
        dictionary = new TreeMap<>(charComparator());
        TreeMap<String, String> tmpTree;

        for (String it : tmp) {
            str = ParseCSV.parseLine(it);
            if (!dictionary.containsKey(str[0].charAt(0))) {
                tmpTree = new TreeMap<>(strComparator());
                tmpTree.put(str[0], str[1]);
                dictionary.put(str[0].charAt(0),
                        tmpTree
                        );
            }
            else {
                if (dictionary.get(str[0].charAt(0)).containsKey(str[0])) {
                    dictionary.get(str[0].charAt(0)).put(str[0],
                            dictionary.get(str[0].charAt(0)).get(str[0]) + str[0] + str[1]);
                } else {
                    dictionary.get(str[0].charAt(0)).put(str[0], str[1]);
                }
            }
        }
    }

    private static LinkedList<String> readCSV() {
        LinkedList<String> csvLines = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(new File("src/dictionary/resources/muellerdict_words.csv"));
            int i = 40;
            while (--i >= 0) {
                csvLines.add(scanner.nextLine());
            }
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
        int total = 0;
        for (Map.Entry<Character, TreeMap<String, String>> it:
        dictionary.entrySet()) {
            System.out.println(it.getKey() + " " + it.getValue());
            total += it.getValue().size();
        }
        System.out.println(total);
    }
}
