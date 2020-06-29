package ru.job4j.block2oop.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(15);
        Battery second = new Battery(10);
        System.out.printf("first battery: %d%nsecond battery: %d", first.load, second.load);
        first.exchange(second);
        System.out.printf("%n%nfirst battery: %d%nsecond battery: %d", first.load, second.load);
    }
}
