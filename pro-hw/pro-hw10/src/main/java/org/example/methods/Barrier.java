package org.example.methods;

import java.util.Random;

/**
 * Enum class with defaults used to make damage to
 * <b>Bicycle</b> class.
 */

public enum Barrier {
    GLASS (3),
    PIT (2),
    PADDLE (1);

    private final int damage;

    private static final Random rnd = new Random();

    Barrier(int i) {
        this.damage = i;
    }

    /**
     * Public method of instance.
     * @return random damage multiplied by constant
     */
    public int getDamage() {
        return damage * rnd.nextInt(1, 6);
    }

    /**
     * Static method generates new random instance of Barrier
     * @return randomly chosen instance of Barrier
     */
    public static Barrier getRandom (){
        return values()[rnd.nextInt(0, values().length)];
    }
}
