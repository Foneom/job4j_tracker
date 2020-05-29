package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

public class Tiger extends Predator {

    public Tiger(String name) {
        super(name);
        System.out.println("Тигр");
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger("Тигр");
    }
}
