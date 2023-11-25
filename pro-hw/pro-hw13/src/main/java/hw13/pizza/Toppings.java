package hw13.pizza;

public enum Toppings {
    MEAT_BOLLS(1.5f),
    TUNA(2.f),
    MUSHROOMS(2.5f),
    CHICKEN(3.f),
    BEEF(3.5f);

    public final float cost;

    Toppings(float cost) {
        this.cost = cost;
    }
}
