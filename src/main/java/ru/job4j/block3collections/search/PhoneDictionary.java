package ru.job4j.block3collections.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> nameContainsKey = person -> person.getName().contains(key);
        Predicate<Person> surnameContainsKey = person -> person.getSurname().contains(key);
        Predicate<Person> phoneContainsKey = person -> person.getPhone().contains(key);
        Predicate<Person> addressContainsKey = person -> person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
        boolean coincidence = nameContainsKey.
                or(surnameContainsKey.
                        or(phoneContainsKey.
                                or(addressContainsKey))).test(person);
            if (coincidence) {
                result.add(person);
            }
        }
        return result;
    }
}


