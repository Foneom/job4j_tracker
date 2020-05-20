package ru.job4j.profession;

public class Doctor extends Profession {
    /**
     * переменная hospital - место работы врача
     */
    private String hospital;
    /**
     * Конструктор клаccа Doctor
     * @param name
     * @param surname
     * @param education
     * @param birthday
     */
    public Doctor(String name, String surname, String education, String birthday, String hospital) {
        /**
         * Вызов конструктора суперкласса Profession
         */
        super(name, surname, education, birthday);
        this.hospital = hospital;
    }
    /**
     * Метод возвращает диагноз пациента
     * @param pacient
     * @return
     */
    public Diagnose health(Pacient pacient) {
        return health(pacient);
    }
}
