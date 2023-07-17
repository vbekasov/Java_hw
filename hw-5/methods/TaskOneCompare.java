
package methods;

import java.util.Scanner;

public class TaskOneCompare {
    private static void supNumbs(double fNum, double sNum) {
        if (Math.abs(10 - fNum) < Math.abs(10 - sNum)) {
            System.out.println("Number " + fNum + " is closer to 10.");
        }
        else if (Math.abs(10 - fNum) > Math.abs(10 - sNum)) {
            System.out.println("Number " + sNum + " is closer to 10.");
        }
        else {
            System.out.println("Entered numbers are the same.");
        }
    }

    public static void compareNums() {
        Scanner scanObj = new Scanner(System.in);

        System.out.print("First num : ");
        double fN = Double.parseDouble(scanObj.nextLine());
        System.out.print("Second num : ");
        double sN = Double.parseDouble(scanObj.nextLine());

        supNumbs(fN, sN);
    }
}
