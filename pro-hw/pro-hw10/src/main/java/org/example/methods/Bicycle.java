package org.example.methods;

import java.util.ArrayList;
import java.util.List;
/**
 * Class storing name of <b>Bicycle</b> and <b>List</b>
 * of <b>parts</b>. Here inner class <b>BicePart</b> and six inner
 * children classes of parts.
 */
public class Bicycle {
    private final String name;
    private final List<BicePart> parts;
    /**
     *
     * @param name sets <b>private final String name</b>.
     *             Constructor adds six instances of new parts to
     *             <b>private final List parts.</b>
     */
    public Bicycle(String name) {
        this.name = name;
        parts = new ArrayList<>();
        parts.add(new Grip());
        parts.add(new Saddle());
        parts.add(new Wheel());
        parts.add(new Gear());
        parts.add(new Frame());
    }
    /**
     *
     * @return number of part in <b>Bicycle</b> instance.
     */
    public int getPartsNumber() { return parts.size();}
    /**
     *
     * @return name of instance.
     */
    public String getName() { return name;}
    /**
     *
     * @param nr place in <b>List of parts</b> to make damage.
     * @param damage amount of damage received by part
     */
    public void makeDamage(int nr, Barrier damage) { parts.get(nr).makeDamage(damage);}
    /**
     *
     * @return could bicycle to ride or not. If any part has health
     * less or equal zero prints bice can not ride more and returns
     * false. Otherwise, return true.
     */
    public boolean isAbleToMove() {
        for (BicePart it : parts)
            if (it.getHealth() <= 0) {
                System.out.println(it + " can not go more.");
                return false;
            }

        return true;
    }

    //=========================================================

    /**
     * Inner class carrying <b>description</b> and <b>health=100</b> of part will be
     * inherited.
     */
    private class BicePart {
        private final String description;
        private int health = 100;

        /**
         *
         * @param description of part.
         */
        public BicePart(String description) { this.description = description;}

        /**
         *
         * @return <b>description</b> of part.
         */
        public String getDescription() { return description;}
        /**
         *
         * @return <b>health</b> of part.
         */
        public int getHealth() { return health;}

        /**
         *
         * @param damage instance of Barrier.
         */
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

    /**
     * Inner class inherited from BikePart.
     */
    private class Grip extends BicePart { public Grip() {super("Forward Grip");}}
    /**
     * Inner class inherited from BikePart.
     */
    private class Saddle extends BicePart { public Saddle() {super("Saddle");}}
    /**
     * Inner class inherited from BikePart.
     */
    private class Wheel extends BicePart { public Wheel() {super("Wheel");}}
    /**
     * Inner class inherited from BikePart.
     */
    private class Gear extends BicePart { public Gear() {super("Gear");}}
    /**
     * Inner class inherited from BikePart.
     */
    private class Frame extends BicePart { public Frame() {super("Frame");}}

}
