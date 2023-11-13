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
        parts.add(new Saddle());
        parts.add(new Wheel());
        parts.add(new Gear());
        parts.add(new Frame());
    }

    public int getPartsNumber() { return parts.size();}
    public String getName() { return name;}
    public void makeDamage(int nr, Barrier damage) { parts.get(nr).makeDamage(damage);}
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
        private int health = 100;

        public BicePart(String description) { this.description = description;}

        public String getDescription() { return description;}

        public int getHealth() { return health;}

        public void makeDamage(Barrier damage) {
            this.health -= damage.getDamage();
            System.out.println(description + " was damaged by " + damage.name() +
                    " on " + damage.getDamage());
        }

        @Override
        public String toString() {
            return "BicePart{" +
                    "description='" + description + '\'' +
                    ", health=" + health +
                    '}';
        }
    }

    private class Grip extends BicePart { public Grip() {super("Forward Grip");}}
    private class Saddle extends BicePart { public Saddle() {super("Saddle");}}
    private class Wheel extends BicePart { public Wheel() {super("Wheel");}}
    private class Gear extends BicePart { public Gear() {super("Gear");}}
    private class Frame extends BicePart { public Frame() {super("Frame");}}

}
