package Gun33___OOP_Encapsulation._01_Ornek;

public class Kisi {
    private String ad;  // karakter olsun
    private String soyad;
    private int yas;    //korumaya alindi

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" +  yas +
                '}';
    }

    void yasAta(int yas) { // veriyi komtrol ederek aldim
        if (yas > 0)
            this.yas = yas;
        else
            System.out.println("Hatali yas");
    }


    int yasVer() {
        return this.yas;
    }

    void setAd(String ad) {
        if (ad.length() < 25)
            this.ad = ad;
    }

    String getAd() {
        return this.ad;
    }

    void setSoyad(String soyad) {
        if (soyad.length() < 25)
            this.soyad = soyad;
    }

    String getSoyad() {
        return this.soyad;
    }
}

