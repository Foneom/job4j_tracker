package ru.job4j.block2oop.animals;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Predator");
    }
    public Predator(String name) {
        super(name);
        System.out.println("Хищник" + name);
    }
}
