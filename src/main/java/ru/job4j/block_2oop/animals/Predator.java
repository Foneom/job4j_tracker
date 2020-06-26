package ru.job4j.block_2oop.animals;

import ru.job4j.block_2oop.animals.Animal;

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
