package ru.job4j.block2oop.profession;

public class Profession {
    /**
     * Переменные - члены класса Profession
     */
    private String name;
    private String surname;
    private String education;
    private String birthday;
    /**
     * Конструктор класса
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     */
    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
