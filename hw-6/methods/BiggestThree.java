package methods;

import java.util.Scanner;

public class BiggestThree {
    private static int[] askThree(){
        int three[] = new int[3];
        Scanner scanObj = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            three[i] = Integer.parseInt(scanObj.nextLine());
        }

        scanObj.close();

        return three;
    }

    public static void biggestOfThree() {
        int three[] = askThree();
        int theBiggest = three[0];

        for (int i :three) {
            if (i > theBiggest)
                theBiggest = i;
        }

        System.out.println("The biggest number is : " + theBiggest);
    }
}
