package ru.job4j.block_2oop.ex;

public class ElementNotFoundEception extends Exception {
    public ElementNotFoundEception(String name) {
        super(name);
    }
}
