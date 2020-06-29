package ru.job4j.block2oop.strategy;

public class Square implements Shape {
        public String draw() {
            String ln = System.lineSeparator();
            return    "|-----| " + ln
                    + "|     | " + ln
                    + "|_____| " + ln;
        }

        public static void main(String[] args) {
            System.out.println(new Triangle().draw());
        }
}
