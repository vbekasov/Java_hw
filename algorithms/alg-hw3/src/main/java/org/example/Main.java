package org.example;

import org.example.methods.TasksUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tests Sum:");
        System.out.println("sum_loop(7, 2)= " + TasksUtil.sum_loop(7, 2));
        System.out.println("sum_loop(12, 3)= " + TasksUtil.sum_loop(12, 3));
        System.out.println("sum(12, 3)= " + TasksUtil.sum_recursion(7, 2));
        System.out.println("sum(12, 3)= " + TasksUtil.sum_recursion(12, 3));
    }
}