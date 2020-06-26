package ru.job4j.block_2oop.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Could't be null");
        }
    }

    public static void main(String[] args) {
        try {
            load("http://localhost:8080/");
        }
        catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
