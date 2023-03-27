package Gun37_Interface.Odev;

public class Main {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(25,4);
        Car c = new Car(100,6, 4);

        b.speedUp(15);
        b.changeGear(7);

        c.speedUp(150);
        c.changeGear(8);

        Bicycle.printAll(b);
        Bicycle.printAll(c);

    }
}
