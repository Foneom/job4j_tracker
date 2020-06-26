package ru.job4j.block_2oop.animals;

public class Animal {

    private String name;

    Animal() {
        System.out.println("Animal");
    }
    Animal(String name) {
        System.out.println("Животное" + name);
    }
}
