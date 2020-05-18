package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
