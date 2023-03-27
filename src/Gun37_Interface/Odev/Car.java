package Gun37_Interface.Odev;

public class Car extends Bicycle implements IVechile {

    int tekersayisi;
    public Car(int speed, int gear, int tekersayisi) {
        super(speed, gear);
        setTekersayisi(tekersayisi);
    }

    public int getTekersayisi() {
        return tekersayisi;
    }

    public void setTekersayisi(int tekersayisi) {
        this.tekersayisi = tekersayisi;
    }
}
