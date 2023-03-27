package Gun37_Interface.Odev;

public class Bicycle implements IVechile{
    private int speed = 0;
    private int gear;

    public Bicycle(int speed, int gear) {
        speedUp(speed);
        changeGear(gear);
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return this.gear;
    }

    @Override
    public int speedUp(int speedUp) {
        this.speed += speedUp;
        return this.speed;
    }

    @Override
    public int changeGear(int gear) {
        this.gear = gear;
        return this.gear;
    }

    @Override
    public int applyBrakes(int frenUygulandi) {
        return this.speed -= frenUygulandi;
    }

    public static void printAll(Bicycle info){
        System.out.println("Current speed: " + info.getSpeed() +
                           "\n Current gear is" + info.getGear());
    }
}
