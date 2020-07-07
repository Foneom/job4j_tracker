package ru.job4j.block4lambda.stream.adress;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Adress> collect(List<Profile> profile) {
        Comparator<Adress> adressComparator = new Comparator<Adress>() {
            @Override
            public int compare(Adress o1, Adress o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        };
        List<Adress> adressList = profile.stream()
                .map(Profile::getAdress)
                .sorted(adressComparator)
                .distinct()
                .collect(Collectors.toList());

        return adressList;
    }
}
