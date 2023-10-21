package namesTree;

import namesTree.names.FullName;
import namesTree.names.FullNameCompare;

import java.util.TreeSet;

public class MainNames {
    public static void main(String[] args) {
        System.out.println("Works");

        FullNameCompare fnCompare = new FullNameCompare();
        TreeSet<FullName> myTree = new TreeSet<>(fnCompare);

        myTree.add(new FullName("AA", "Tghh"));
        myTree.add(new FullName("AB", "Hasd"));
        myTree.add(new FullName("BC", "Lgdf"));
        myTree.add(new FullName("BB", "Cgfd"));
        myTree.add(new FullName("AB", "QQQQ"));

        System.out.println(myTree);
    }
}
