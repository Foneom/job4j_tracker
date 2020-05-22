package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

public class Tiger extends Predator {

    public Tiger() {
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        super();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигр");
    }
}
