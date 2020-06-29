package ru.job4j.block2oop.strategy;

public class Triangle implements Shape {

        public String draw() {
            String ln = System.lineSeparator();
            return    "   ^    " + ln
                    + " /   \\ " + ln
                    + "/_____\\" + ln;
        }
    }


