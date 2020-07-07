package ru.job4j.block4lambda.stream.adress;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Adress> collect(List<Profile> profile) {
        List<Adress> adressList = profile.stream()
                .map(Profile::getAdress)
                .collect(Collectors.toList());
        return adressList;
    }
}
