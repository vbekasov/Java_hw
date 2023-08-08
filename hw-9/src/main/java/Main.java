import java.util.Arrays;

import methods.OneMissing;

public class Main {
    public static void main(String[] args) {
        System.out.println("Works");

        OneMissing testObj = new OneMissing(10);
        testObj.printArray();
        System.out.println(Arrays.toString(testObj.getArr()));

        int arr[] = testObj.getArr();
        boolean tmp[] = new boolean[arr.length + 2];
        for (int i : arr) {
            System.out.print(i + " ");
            tmp[i-1] = true;
            System.out.println(tmp[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(tmp));

    }
}
