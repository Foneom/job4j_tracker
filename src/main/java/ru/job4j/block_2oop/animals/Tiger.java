package ru.job4j.block_2oop.animals;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Tiger");
    }
    public Tiger(String name) {
        super(name);
        System.out.println("Тигр" + name);
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
    }
}
