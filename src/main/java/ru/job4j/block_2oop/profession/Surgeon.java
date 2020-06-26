package ru.job4j.block_2oop.profession;

public class Surgeon extends Doctor {
    /**
     * private переменная speciality - член класса - специальность хирурга(травматолог, ортопед)
     */
    private String speciality;
    /**
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param hospital - больница (место работы)
     * @param speciality - специализация
     */
    public Surgeon(String name, String surname, String education, String birthday, String hospital, String speciality) {
        /**
         * Вызов конструктора суперкласса Doctor
         */
        super(name, surname, education, birthday, hospital);
        this.speciality = speciality;
    }

}
