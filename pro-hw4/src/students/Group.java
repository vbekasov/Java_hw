package students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Group {
    private final Map<Character, ArrayList<String>> nameMap;

    {
        nameMap = new HashMap<>();
        nameMap.put('0', null);
    }

    public Group() throws FileNotFoundException {
        InputStream fnames = new FileInputStream("src/students/data/first-names.txt");
        ArrayList<String> tmpNames = new ArrayList<>();

        try (Scanner sc = new Scanner(
                fnames, StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()) {
                tmpNames.add(sc.nextLine());
            }
        }

        Character tmp;
        for (String i : tmpNames) {
            tmp = i.charAt(0);
            if (!nameMap.containsKey(tmp)) {
                ArrayList<String> tmpArr = new ArrayList<>();
                tmpArr.add(i);
                nameMap.put(tmp, tmpArr);
            } else {
                nameMap.get(tmp).add(i);
            }
        }
    }

    public ArrayList<String> findStudents(String letters) {
        int len = letters.length();
        ArrayList<String> students = nameMap.get(letters.charAt(0));
        String tmp;
        ArrayList<String> retArr = new ArrayList<>();

        for (String i : students) {
            if (i.length() >= len) {
                tmp = i.substring(0, len);
                if (tmp.equals(letters))
                    retArr.add(i);
            }
        }

        return retArr;
    }
}
