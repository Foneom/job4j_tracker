package ru.job4j.block_2oop.oop;

public class Story {

    public static void main(String [] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
