package breakfast.methods;

import java.util.Queue;
import java.util.Stack;

public class Table {
    private final Stack<Pancake> cakes;

    public Table() {
        this.cakes = new Stack<Pancake>();
    }

    public void addCake(Queue<Pancake> input) {
        while (!input.isEmpty())
            cakes.push(input.poll());

        System.out.println("Added. Total pancakes : " + cakes.size());
    }

    public void removeCake(int count) {
        while (!cakes.isEmpty() && --count >= 0)
            cakes.pop();

        System.out.println("Eaten. Total pancakes : " + cakes.size());
    }
}
