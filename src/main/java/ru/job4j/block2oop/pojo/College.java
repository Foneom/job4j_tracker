package ru.job4j.block2oop.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иван Петрович Сидоров");
        student.setGroup("2AС4");
        student.setDate("01.09.2012");
        System.out.printf("Студент %s поступил в университет %s, зачислен в группу %s", student.getName(),
                student.getDate(), student.getGroup());
    }
}
