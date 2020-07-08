package ru.job4j.block4lambda.stream;

import java.util.stream.Stream;

public enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static Stream<Suit> streamSuit() {
        return Stream.of(Suit.values());
    }

    public static Stream<Value> streamValue() {
        return Stream.of(Value.values());
    }

    public static void main(String[] args) {
            Card.streamSuit()
                    .forEach(System.out::println);
        System.out.println("-----------------------");
            Card.streamValue()
                    .forEach(System.out::println);
        }
    }