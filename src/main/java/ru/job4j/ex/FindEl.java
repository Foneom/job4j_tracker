package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundEception {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                System.out.println("Element found");
                break;
            } else {
                throw new ElementNotFoundEception("Element not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"first", "second", "third"}, "fourth");
        } catch (ElementNotFoundEception e) {
            e.printStackTrace();
        }
    }
}
