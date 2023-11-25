package algorithms;

import algorithms.path.PathFinder;
import algorithms.util.ReadGrid;
import chart_tutorial.scatter.ScatterPlot;

import javax.swing.*;
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
        System.out.println("====================");
        grid.cutPath();
        grid.printGrid();
        System.out.println("====================");
        grid.printRoads();
        System.out.println("====================");
        ScatterPlot ex = new ScatterPlot("Greed", ReadGrid.greedToDataset(grid.getGrid(), (Integer)0, "Ints road"));

        SwingUtilities.invokeLater(
                () -> {
                    ex.setSize(800, 400);
                    ex.setLocationRelativeTo(null);
                    ex.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    ex.setVisible(true);
                });
    }
}
