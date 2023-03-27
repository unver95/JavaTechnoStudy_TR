package Gun38;

public class ToyotaPirus extends Vehicle implements IElectric, IGas {


    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "omur boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrikle gider";
    }
}

