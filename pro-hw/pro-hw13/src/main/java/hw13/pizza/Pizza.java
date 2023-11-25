package hw13.pizza;

import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private float price;
    private int numToppings;
    private final List<Toppings> toppings;

    private Pizza(PizzaBuilder pz) {
        this.price = pz.price;
        this.numToppings = pz.numToppings;
        this.toppings = new LinkedList<>();
        try {
            this.toppings.addAll(pz.toppings);
        } catch (Exception e) {
            throw new NullPointerException("Empty Topping List");
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", numToppings=" + numToppings +
                ", toppings=" + toppings +
                '}';
    }

    public static class PizzaBuilder {
        private float price;
        private int numToppings = 0;
        private List<Toppings> toppings;

        public PizzaBuilder setPrice() {
            this.price = price;

            return this;
        }

        public PizzaBuilder setToppings(Toppings e) {
            this.toppings.add(e);
            this.price += e.cost;
            this.numToppings++;

            return this;
        }

        public PizzaBuilder(float price) {
            this.toppings = new LinkedList<>();
            this.price = price;
        }

        public PizzaBuilder() {
            this.toppings = new LinkedList<>();
            this.price = 0.f;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
