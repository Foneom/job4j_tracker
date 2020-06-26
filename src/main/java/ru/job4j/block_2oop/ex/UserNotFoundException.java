package ru.job4j.block_2oop.ex;

public class UserNotFoundException  extends Exception {
    public UserNotFoundException(String name) {
        super(name);
    }
}
