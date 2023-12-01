package lambda.task_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Создайте список чисел. С помощью метода `forEach` выведите
 * каждое число в консоль по модулю.
 */
public class ForEach {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> tmp = new ArrayList<>(5);
        for (int i = 0; i < 5; i++)
            tmp.add(rnd.nextInt(-10, 11));
        System.out.println(tmp.toString());
        Consumer<Integer> printAbs = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(Math.abs(integer) + " | ");
            }
        };
        tmp.forEach(printAbs);
    }
}
