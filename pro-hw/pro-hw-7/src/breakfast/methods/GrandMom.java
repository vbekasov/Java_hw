package breakfast.methods;

import java.util.LinkedList;
import java.util.Queue;

public class GrandMom {
    private final int   CAKES_COOK = 2;

    public GrandMom() {}

    public void cook(Table table) {
        Queue<Pancake> tmp = new LinkedList<>();
        for (int i = 0; i < CAKES_COOK; i++)
            tmp.add(new Pancake());
        table.addCake(tmp);
    }
}
