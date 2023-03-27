package Gun40.Ornek_1;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Kartal mamasi");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunde 500 gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void ses() {
        System.out.println("Gar");
    }
}
