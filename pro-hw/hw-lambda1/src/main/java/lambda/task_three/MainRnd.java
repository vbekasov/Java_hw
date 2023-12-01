package lambda.task_three;

import java.util.Random;

public class MainRnd implements LambdaRnd{
    public static void main(String[] args) {
        Rand  rndInt = (start, stop) -> {
            return (new Random()).nextInt(start, stop + 1);
        };

        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
        System.out.println("Random int : " + rndInt.rnd(-5, 5));
    }
}
