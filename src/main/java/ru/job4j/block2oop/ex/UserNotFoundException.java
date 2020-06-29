package ru.job4j.block2oop.ex;

public class UserNotFoundException  extends Exception {
    public UserNotFoundException(String name) {
        super(name);
    }
}
