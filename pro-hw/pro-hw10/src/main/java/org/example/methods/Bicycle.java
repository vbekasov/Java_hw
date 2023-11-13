package org.example.methods;

import java.util.ArrayList;
import java.util.List;

public class Bicycle {
    private final String name;
    private final List<BicePart> parts;

    public Bicycle(String name) {
        this.name = name;
        parts = new ArrayList<>();
        parts.add(new Grip());
    }

    public int getPartsNumber() { return parts.size();}
    public String getName() { return name;}
    public void setParts(int nr, int damage) { parts.get(nr).makeDamage(damage);}
    public boolean isAbleToMove() {
        for (BicePart it : parts)
            if (it.getHealth() <= 0) {
                System.out.println(it + " can not go more.");
                return false;
            }

        return true;
    }

    //=========================================================

    private class BicePart {
        private final String description;
        private int health;

        public BicePart(String description) { this.description = description;}

        public String getDescription() { return description;}

        public int getHealth() { return health;}

        public void makeDamage(int damage) { this.health -= damage;}
    }

    private class Grip extends BicePart {
        public Grip() {
            super("Forward Grip");
        }
    }
}
