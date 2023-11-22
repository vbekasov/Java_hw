package duplicates;

import java.util.*;

public class MainDup {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> rndInts = new ArrayList<>(20);
        for (int i = 0; i < 20; i++)
            rndInts.add(rnd.nextInt(-5, 6));
        System.out.println("Random ints : \n" + rndInts);

        Set<Integer> tmp = new HashSet<>(rndInts);
        System.out.println("Without duplicates : \n" + tmp);
    }
}
