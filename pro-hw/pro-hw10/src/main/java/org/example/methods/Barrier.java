package org.example.methods;

import java.util.Random;

public enum Barrier {
    GLASS (3),
    PIT (2),
    PADDLE (1);

    private final int damage;

    public static final Random rnd = new Random();

    Barrier(int i) {
        this.damage = i;
    }

    public int getDamage() {
        return damage * rnd.nextInt(1, 6);
    }

    public static Barrier getRandom (){
        return values()[(int) (rnd.nextInt(0, values().length))];
    }
}
