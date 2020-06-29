package ru.job4j.collection.passportoffice;

import org.junit.Test;
import ru.job4j.block3collections.passportoffice.Citizen;
import ru.job4j.block3collections.passportoffice.PassportOffice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}