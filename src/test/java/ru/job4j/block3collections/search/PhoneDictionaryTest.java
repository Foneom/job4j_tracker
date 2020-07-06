package ru.job4j.block3collections.search;


import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Kirill", "Ivanov", "12345", "Moskva")
        );
        ArrayList<Person> persons = phones.find("Kirill");
        assertThat(persons.get(0).getSurname(), is("Ivanov"));
    }
}