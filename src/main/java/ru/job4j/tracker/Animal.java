package ru.job4j.tracker;

import java.sql.SQLOutput;

public class Animal {

    private String name;

    Animal() {
        System.out.println("Animal");
    }
    Animal(String name) {
        System.out.println("Животное" + name);
    }
}
