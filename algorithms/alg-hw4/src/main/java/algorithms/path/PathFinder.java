package algorithms.path;

import java.util.Arrays;

public class PathFinder {
    private final int[][] grid;
    private final int rows;
    private final int cols;
    private Pair road = null;


    public PathFinder(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
    }

    private void getCost(int x, int y) {
        grid[x][y] += Math.min(grid[x - 1][y], grid[x][y - 1]);
    }

    private void solveEdge() {
        int i;
        for (i = 2; i < cols; i++)
            grid[0][i] += grid[0][i - 1];

        for (i = 2; i < rows; i++)
            grid[i][0] += grid[i - 1][0];
    }

    private void solveBody() {
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++)
                getCost(i, j);
        }
    }

    public int solve() {
        this.solveEdge();
        this.solveBody();

        return grid[rows - 1][cols - 1];
    }

    public void printGrid() {
        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(grid[i]));
    }

    public void cutPath() {
        road = new Pair(rows - 1, cols - 1);
        supCut(rows - 1, cols - 1, road);
        //supCutEdge();
    }

    private void supCut(int x, int y, Pair pair) {
        if (x != 0 && y != 0) {
            if (grid[x - 1][y] == grid[x][y - 1]) {
                supCut(x - 1, y, pair.addTop());
                supCut(x, y - 1, pair.addLeft());
            } else if (grid[x - 1][y] > grid[x][y - 1])
                supCut(x, y - 1, pair.addLeft());
            else
                supCut(x - 1, y, pair.addTop());
        } else if (x == 0 && y - 1 != 0)
            supCut(x, y - 1, pair.addLeft());
        else if (x - 1 != 0 && y == 0)
            supCut(x - 1, y, pair.addTop());
    }

    private void supCutEdge() {
        int x = rows - 2;
        int y = cols - 2;

        for (; x > 0; x--)
            if (grid[x + 1][0] == 0)
                grid[x][0] = 0;

        for (; y > 0; y--)
            if (grid[0][y + 1] == 0)
                grid[0][y] = 0;
    }

    public void fillRoadWithZero() {
        supZero(road);
    }

    private void supZero(Pair pair) {
        if (pair.left != null)
            supZero(pair.left);

        if (pair.top != null)
            supZero(pair.top);

        grid[pair.x][pair.y] = 0;
    }

    public void printRoads() {
        supPrintRoads(this.road);
    }

    private void supPrintRoads(Pair pair) {
        pair.printXY();
        if (pair.left != null)
            supPrintRoads(pair.left);

        if (pair.top != null)
            supPrintRoads(pair.top);

        //pair.printXY();
        if (pair.top == null && pair.left == null)
            System.out.println("-----");
    }

    public Integer[][] getGrid() {
        Integer[][] ret = new Integer[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ret[i][j] = grid[i][j];
            }
        }
        return ret;
    }

    //====================

    private class Pair {
        private Pair left = null;
        private Pair top = null;
        private final int x;
        private final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private Pair addLeft() {
            this.left = new Pair(x, y - 1);

            return this.left;
        }

        private Pair addTop() {
            this.top = new Pair(x - 1, y);

            return this.top;
        }

        public void printXY() {
            System.out.println(x + "\t" + y);
        }

        public Pair getLeft() {
            return left;
        }

        public Pair getTop() {
            return top;
        }
    }
}
