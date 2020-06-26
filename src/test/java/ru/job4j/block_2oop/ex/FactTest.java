package ru.job4j.block_2oop.ex;

import org.junit.Test;


public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThenZero() {
        new Fact().calc(-1);
    }
}