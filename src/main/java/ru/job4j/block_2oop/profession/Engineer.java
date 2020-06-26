package ru.job4j.block_2oop.profession;

public class Engineer extends Profession {
    /**
     * переменная класса Engineer - сфера деятельности
     */
    private String fieldOfActivity;
    /**
     * Конструктор класса Engineer
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param fieldOfActivity - сфера деятельности
     */
    public Engineer(String name, String surname, String education, String birthday, String fieldOfActivity) {
        /**
         * Вызов конструктора суперкласса Profession
         */
        super(name, surname, education, birthday);
        this.fieldOfActivity = fieldOfActivity;
    }
    /**
     * Метод возвращает назначение(тип) проекта
     * @param project
     * @return
     */
    public Type name(Project project) {
        return name(project);
    }
}
