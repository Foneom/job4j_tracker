package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(10);
        System.out.printf("first battery: %d%nsecond battery: %d", first.load, second.load);
        second.exchange(first);
        System.out.printf("%n%nfirst battery: %d%nsecond battery: %d", first.load, second.load);
    }
}
