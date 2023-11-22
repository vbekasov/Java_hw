package bicycles;

import java.util.ArrayList;
import java.util.Arrays;

public class MainBicycle {
    public static void main(String[] args) {
        System.out.println("---Task Three---");

        Bicycle bice1 = Bicycle.productBecycle(
          "Road", "Factory1", "Ivan",
          6, 213);
        Bicycle bice2 = Bicycle.productBecycle(
                "Sport", "Factory2", "Piter",
                12, 321);
        Bicycle bice3 = Bicycle.productBecycle(
                "Children", "Factory3", "John",
                3, 123);

        System.out.println("Question 2:\n" +
                bice1 + "\n" +
                bice2 + "\n" + bice3 + "\n---------");

        Bicycle[] biceArr = {bice1, bice2, bice3};
        System.out.println("Question 3, 4:\n" + Arrays.toString(biceArr)
                + "\n---------");
    }
}
