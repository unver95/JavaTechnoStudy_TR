package Gun33___OOP_Encapsulation.Gunun_Sorusu.Benim;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;

    private int id;

    static int sayac = 1;


    public Ogrenci(String ad, String soyad, int yas, int sayac) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
        setId(sayac);

    }

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yas) {
    }

    public void setAd(String ad) {
        if (ad.length() < 6) {
            this.ad = ad;
        } else {
            System.out.println("ggwp");
        }
    }

    public String getAd() {
        return this.ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSoyad() {
        return this.soyad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return this.yas;
    }

    public void setId(int sayac) {
        this.id = sayac;
    }

    public int getId() {
        return this.id;
    }
}
