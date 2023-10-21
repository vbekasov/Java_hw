package iterators;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(3);
        iList.add(534);
        iList.add(64);
        iList.add(27);
        iList.add(95);
        iList.add(15);
        Iterator<Integer> it1 = iList.iterator();
        while (it1.hasNext())
            System.out.print(it1.next() + "  ");

        System.out.println("\n============================");
        Set<String> sSet = new HashSet<>();
        sSet.add("sdf");
        sSet.add("khgf");
        sSet.add("tgb");
        sSet.add("mkhf");
        sSet.add("wrty");
        for (Iterator<String> i = sSet.iterator(); i.hasNext();)
            System.out.print(i.next() + "  ");
        System.out.println("");
    }
}
