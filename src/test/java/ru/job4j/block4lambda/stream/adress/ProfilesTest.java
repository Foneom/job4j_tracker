package ru.job4j.block4lambda.stream.adress;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
import java.util.List;


public class ProfilesTest {

    @Test
    public void whenListTrue() {
        List<Adress> profiles = Arrays.asList(
                new Adress("Moskva", "Koloncova", 2, 45)
        );
        List<Profile> result = Arrays.asList(
                new Profile(profiles.get(0))
        );
        List<Adress> expected = Profiles.collect(result);
        assertThat(profiles, is(expected));
    }

}