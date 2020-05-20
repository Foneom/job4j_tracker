package ru.job4j.profession;

public class Builder extends Engineer {
    /**
     * private переменная engineerType - специализация ижененера
     */
    private String engineerType;
    /**
     * Конструктор класса Builder
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param fieldOfActivity - сфера деятельности
     * @param engineerType - направление инженера
     */
    public Builder(String name, String surname, String education, String birthday, String fieldOfActivity, String engineerType) {
        /**
         * Вызов конструктора суперкласса Engineer
         */
        super(name, surname, education, birthday, fieldOfActivity);
        this.engineerType = engineerType;
    }
}
