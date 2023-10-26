package methods;

import java.util.Random;

public class RisingArray {
    private int Arr[];

    private void generateRandArr() {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            this.Arr[i] = rand.nextInt(89) + 10;
        }
    }

    public RisingArray() {
        this.Arr = new int[5];

        generateRandArr();
    }

    public void printArray() {
        System.out.println("Array : ");
        for (int i : this.Arr) {
            System.out.print(" " + i + "|");
        }
        System.out.println();
    }

    public boolean checkRising() {
        int i = 1;
        while (i < 5 && (this.Arr[i] > this.Arr[i-1]))
            i++;

        if (i == 5)
            return true;
        else
            return false;
    }

    public void generateRising() {
        while (!checkRising()) {
            generateRandArr();
        }
    }

    public void ifRising() {
        if (checkRising())
            System.out.println("Rising");
        else
            System.out.println("Not Rising");
    }
}
