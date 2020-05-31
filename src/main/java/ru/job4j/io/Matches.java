package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    /**
     * Объект класса Scanner
     */
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Начальное количество спичек
     */
    private static int result = 11;
    /**
     * Метод логики игры
     */
    public void game() {
            System.out.println("Вытяните от 1 до 3 спичек ");
            int step = scanner.nextInt();
            if (step >= 1 && step <= 3) {
                result -= step;
                System.out.println("Осталось " + result + " спичек");
            }
            else {
                System.out.println("Нарушены правила игры");
                System.exit(0);
            }
    }
    public static void main(String[] args) {
        Matches gamer1 = new Matches();
        Matches gamer2 = new Matches();
        while (result <= 11 && result > 0) {
            System.out.println("Ход первого игрока: ");
            gamer1.game();
            System.out.println("Ход второго игрока: ");
            gamer2.game();
        }
        System.out.println("Вы выйграли!");
        System.exit(0);
    }
}
