package methods;

import java.util.Random;

public class RandomArray {
    private int Arr[];

    private void generateRandArr() {
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            this.Arr[i] = rand.nextInt(49) + 1;
        }
    }

    public RandomArray() {
        this.Arr = new int[8];
        
        generateRandArr();
    }

    public void printArray() {
        System.out.println("Array : ");
        for (int i : this.Arr) {
            System.out.print(" " + i + "|");
        }
        System.out.println();
    }

    public void oddToZero() {
        for (int i = 1; i <= 7; i += 2) {
            this.Arr[i] = 0;
        }
    }

}
