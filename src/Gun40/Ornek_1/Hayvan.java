package Gun40.Ornek_1;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi = true;
    private String dogumTarihi;

   abstract void yiyecegi();
   abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
   abstract void ses();

    private static int sayac =0;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = sayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("**************");
        System.out.println("ID " + id);
        System.out.println("Isim " + isim);
        System.out.println("Vahsi " + vahsi);
        System.out.println("DogumTarihi " + dogumTarihi);

        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        ses();

        return "Hayvandan turetildi";
    }
}
