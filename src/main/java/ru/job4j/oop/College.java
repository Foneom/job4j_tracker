package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        /**
         * Приведение к типу родителя Student
         */
        Student student = freshman;
        /**
         * апкастинг, повышение в иерархии
         */
        Student st = new Freshman();
        /**
         * даункастинг, понижение в иерархии
         */
        Freshman freshmanFromStudent = (Freshman) st;

        /**
         * Приведение Student к типу родителя Object
         */
        Object object = student;
        /**
         * апкастинг, повышение в иерархии
         */
        Object ob = new Student();
        /**
         * даункастинг, понижение в иерархии
         */
        Student stFromObject = (Freshman) ob;
    }
}
