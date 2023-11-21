package algorithms;

import algorithms.path.PathFinder;
import algorithms.util.ReadGrid;

import java.util.Arrays;

public class Main {
    private static final String PATH = "src/main/java/algorithms/grid.data";

    public static void main(String[] args) {
        System.out.println("Hello world!");

        PathFinder grid = new PathFinder(ReadGrid.readGrid(PATH));
        grid.printGrid();
        System.out.println("====================");
        System.out.println("Answer : " + grid.solve() + "\n=======");
        grid.printGrid();
    }
}