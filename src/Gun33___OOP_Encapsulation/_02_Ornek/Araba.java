package Gun33___OOP_Encapsulation._02_Ornek;

public class Araba {
    private String renk;
    private int model;
    private double motorHacmi;
    private int kapiSayisi;

    public Araba() {
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
        //this.renk = renk;
        //this.model = model;
        //this.motorHacmi = motorHacmi;
        //this.kapiSayisi = kapiSayisi;
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return this.renk;
    }

    public void setModel(int model) {
        if (model > 1800) {
            this.model = model;
        } else
            System.out.println("yanlis model girdin");
    }

    public int getModel() {
        return this.model;
    }

    public void setMotorHacmi(double motorHacmi) {
        if (motorHacmi > 0) {
            this.motorHacmi = motorHacmi;
        } else
            System.out.println("gecersiz motor hacmi");
    }

    public double getMotorHacmi() {
        return this.motorHacmi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi > 0) {
            this.kapiSayisi = kapiSayisi;
        }
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}