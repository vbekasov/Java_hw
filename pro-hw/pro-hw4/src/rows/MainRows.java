package rows;

import rows.methods.InfiniteInput;

public class MainRows {
    public static void main(String[] args) {
        InfiniteInput ii = new InfiniteInput();

        ii.startInput();
        System.out.println("Longest :" + ii.getLongest());
        System.out.println("Shortest :" + ii.getShortest());
    }
}
