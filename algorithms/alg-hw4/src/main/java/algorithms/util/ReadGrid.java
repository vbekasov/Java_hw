package algorithms.util;

import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadGrid {
    private ReadGrid() {}

    public static int[][] readGrid(String fName) {
        int[][] grid;
        try {
            File f = new File(fName);
            BufferedReader br = new BufferedReader(new FileReader(fName));
            StringBuilder s = new StringBuilder(br.readLine());
            String[] tmp = s.toString().split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);
            grid = new int[x][y];

            s = new StringBuilder(y * 4 + 1);
            int i = -1;
            for (; x > 0; x--) {
                s.append(br.readLine());
                tmp = s.toString().split(" ");
                grid[++i] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
                s.setLength(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return grid;
    }

    public static <T extends Comparable<T>> XYDataset greedToDataset(T[][] arr, T sign, String title) {
        final int xLen = arr.length;
        final int yLen = arr[0].length;
        XYSeriesCollection ser = new XYSeriesCollection();
        XYSeries road = new XYSeries("road");
        XYSeries wall = new XYSeries("wall");

        for (int i = 0; i < xLen; i++)
            for (int j = 0; j < yLen; j++)
                if (arr[i][j].equals(sign))
                    road.add(j, -1 * i);
                else
                    wall.add(j, -1 * i);

        ser.addSeries(road);
        ser.addSeries(wall);
        XYSeries tmp = new XYSeries("show");
        tmp.add(-0.2, 0.2);
        ser.addSeries(tmp);
        return ser;
    }
}
