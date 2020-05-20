package ru.job4j.profession;

public class Programmer extends Engineer {
    /**
     * private переменная language - язык на котором пишет программист
     */
    private String language;
    /**
     * Конструктор класса Programmer
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param fieldOfActivity - сфера деятельности
     * @param language - язык программирования
     */
    public Programmer(String name, String surname, String education, String birthday, String fieldOfActivity, String language) {
        /**
         * Вызов конструктора суперкласса Engineer
         */
        super(name, surname, education, birthday, fieldOfActivity);
        this.language = language;
    }
}
