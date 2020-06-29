package ru.job4j.block2oop.ex;

public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String name) {
        super(name);
    }
}
