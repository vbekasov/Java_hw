import find_single.Single;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int[] arr2 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};
        int[] arr3 = {1, 1, 2, 2, 3, 5, 5, 6, 6};
        int[] arr4 = {1, 1, 2, 3, 3};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("(loop) Single in a row : " + Single.loopSicker(arr1));
        System.out.println("(loop) Single in a row : " + Single.loopSicker(arr2));
        System.out.println("(loop) Single in a row : " + Single.loopSicker(arr3));
        System.out.println("=============================");
        System.out.println("(binary) Single in a row : " + Single.binarySicker(arr1));
        System.out.println("(binary) Single in a row : " + Single.binarySicker(arr2));
        System.out.println("(binary) Single in a row : " + Single.binarySicker(arr3));
        System.out.println("(binary) Single in a row : " + Single.binarySicker(arr4));


    }
}
