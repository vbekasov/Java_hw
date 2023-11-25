package hw13;

import hw13.pizza.Pizza;
import hw13.pizza.Toppings;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza task");
        Pizza pizza = new Pizza.PizzaBuilder(10.f).
                setToppings(Toppings.BEEF).setToppings(Toppings.MUSHROOMS).
                setToppings(Toppings.TUNA).build();
        System.out.println(pizza.toString());

        System.out.println("\n===Complex Numbs======\n");


    }
}