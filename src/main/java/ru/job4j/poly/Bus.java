package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Ехать");
    }

    @Override
    public void pass(int passenger) {
        System.out.println("Число пассажиров: " + passenger);
    }

    @Override
    public int getFuel(int fuel) {
        int priceLiter = 41;
        return priceLiter * fuel;
    }
}
