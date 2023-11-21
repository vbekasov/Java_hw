package algorithms.util;

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
}
