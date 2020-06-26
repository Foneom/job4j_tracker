package ru.job4j.block_2oop.profession;

public class Dentist extends Doctor {
    /**
     * private переменная speciality - член класса - специальность стоматолога(протезист, терапевт)
     */
   private String speciality;
    /**
     * Конструктор класса Dentist
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - дата рождения
     * @param hospital - больница (место работы)
     * @param speciality - специализация
     */
   public Dentist(String name, String surname, String education, String birthday, String hospital, String speciality) {
       super(name, surname, education, birthday, hospital);
       this.speciality = speciality;
   }
}
