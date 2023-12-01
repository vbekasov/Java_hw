package lambda.task_two;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Создайте `мапу`, хранящую товар и соответствующее ему
 *  число единиц товара. С помощью метода `forEach` получите все
 *  товары, у которых осталось меньше 3 штук.
 */
public class MainItem {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Item, Integer> stock = new TreeMap<>();
        stock.put(new Item("Q", rnd.nextInt(1, 10000)) , 1);
        stock.put(new Item("W", rnd.nextInt(1, 10000)) , 2);
        stock.put(new Item("E", rnd.nextInt(1, 10000)) , 3);
        stock.put(new Item("R", rnd.nextInt(1, 10000)) , 4);
        stock.put(new Item("T", rnd.nextInt(1, 10000)) , 5);

        stock.forEach((key, value) -> System.out.printf(
                "Item : %s | quantity : %d\n",
                key.toString(), value
        ));

        stock.forEach((item, integer) -> {
            if (integer < 3)
                System.out.println(item + " quantity : " + integer);
        });
    }
}
