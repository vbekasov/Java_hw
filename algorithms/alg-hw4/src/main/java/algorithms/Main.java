package algorithms;

import algorithms.path.PathFinder;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] costs = new int[][]{
                {0, 1, 4, 4},
                {4, 1, 1, 1},
                {4, 4, 4, 1},
                {4, 4, 4, 0}};

        PathFinder grid = new PathFinder(costs);
        grid.printGrid();
        System.out.println("=================");
        grid.solve();
        grid.printGrid();

    }
}