package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainNumbers {
    public static void main(String[] args) {
        System.out.println("---First Method---");
        ArrayList<Integer> nums = generateArray(10);
        for (Integer i : nums)
            System.out.print(i + " ");

        System.out.println("\n---Second Method---");
        deleteNegative(nums);
        for (Integer i : nums)
            System.out.print(i + " ");
    }

    private  static ArrayList<Integer> generateArray(int cap) {
        ArrayList<Integer> randNums = new ArrayList<Integer>(cap);
        Random rnd = new Random();

        for (int i = 0; i < cap; i++)
            randNums.add(rnd.nextInt(-100, 101));

        return randNums;
    }

    private static void deleteNegative(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) < 0) {
                nums.remove(i);
                i--;
            }
    }
}
