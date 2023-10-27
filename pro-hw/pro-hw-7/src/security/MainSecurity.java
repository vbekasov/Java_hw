package security;

import security.people.Club;
import security.people.Person;
import security.people.Security;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MainSecurity {
    public static void main(String[] args) {
        Random rnd = new Random();
        Queue<Person> tmp = new LinkedList<>();
        tmp.add(new Person("qqrt", rnd.nextInt(18, 24)));
        tmp.add(new Person("yggd", rnd.nextInt(18, 24)));
        tmp.add(new Person("vvfd", rnd.nextInt(18, 24)));
        tmp.add(new Person("pdgh", rnd.nextInt(18, 24)));
        tmp.add(new Person("njjd", rnd.nextInt(18, 24)));
        System.out.println("Queue :\n" + tmp);

        Security guard = new Security("Gates", 35, tmp);
        Club.addToClub(guard.passOrKick());
        System.out.println("\nInside Club :");
        Club.printInside();

    }

}
