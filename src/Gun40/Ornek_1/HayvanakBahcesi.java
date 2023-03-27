package Gun40.Ornek_1;

public class HayvanakBahcesi {
    public static void main(String[] args) {

        Hayvan k1 = new Kedi("Tom", false, "12/10/2010");
        k1.toString();

        Hayvan k2 = new Kedi("Senna", true, "02/02/2022");
        k2.toString();

        Hayvan h2 = new Kartal("Ucan Ucak", true, "01/05/200");
        h2.toString();
    }
}
