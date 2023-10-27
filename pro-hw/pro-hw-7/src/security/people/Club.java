package security.people;

import java.util.*;

public class Club {
    private static Set<Person> inside = new HashSet<>();

    private Club() {}

    public static void addToClub(Queue<Person> income) {
        inside.addAll(income);
    }

    public static void printInside() {
        System.out.println(inside);
    }
}
