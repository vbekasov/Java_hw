package students;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainStudents {
    public static void main(String[] args) throws FileNotFoundException {
        Group students = new Group();
        ArrayList<String> tmp = students.findStudents("Ad");

        System.out.println("---First Check---");
        for (String i : tmp)
            System.out.println(i);

        System.out.println("\n---Second Check---");
        tmp = students.findStudents("Mal");
        for (String i : tmp)
            System.out.println(i);
    }
}
