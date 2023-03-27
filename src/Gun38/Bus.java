package Gun38;

public class Bus extends Vehicle implements IDeisel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Bir depo ile 10000km gider";
    }

    @Override
    public String drive() {
        return "Sehir icinden gidemez, yavas sur";
    }
}
