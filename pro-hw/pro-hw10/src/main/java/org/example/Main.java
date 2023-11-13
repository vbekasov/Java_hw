package org.example;

import org.example.methods.Barrier;
import org.example.methods.Bicycle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bicycle tmp = new Bicycle("MyBice");
        Random rnd = new Random();

        while (tmp.isAbleToMove())
            tmp.makeDamage(rnd.nextInt(0, tmp.getPartsNumber()),
                    Barrier.getRandom());
    }
}