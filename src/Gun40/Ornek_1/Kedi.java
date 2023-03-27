package Gun40.Ornek_1;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Kedi mamasi");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunde 250 gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("12 saat");
    }

    @Override
    void ses() {
        System.out.println("Miauw");
    }
}
