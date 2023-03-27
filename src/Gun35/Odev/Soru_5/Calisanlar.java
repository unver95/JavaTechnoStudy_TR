package Gun35.Odev.Soru_5;

public class Calisanlar {
    private String isim;
    private String adres;
    private String okul;
    private int maas;
    private UveyTipi uveyTipi;

    Calisanlar(String isim, String adres, String okul, int maas, UveyTipi uveyTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setMaas(maas);
        setUveyTipi(uveyTipi);
    }


    Calisanlar(String isim, String adres, String okul ,UveyTipi uveyTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUveyTipi(uveyTipi);
    }

    Calisanlar(String isim) {
        setIsim(isim);
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getAdres() {
        return this.adres;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }

    public String getOkul() {
        return this.okul;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaas() {
        return this.maas;
    }

    public void setUveyTipi(UveyTipi uveyTipi) {
        this.uveyTipi = uveyTipi;
    }

    public UveyTipi getUveyTipi() {
        return this.uveyTipi;
    }

    @Override
    public String toString() {
        return " Calisanlar{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul='" + okul + '\'' +
                ", maas=" + maas +
                ", uveyTipi=" + uveyTipi + "\n";
    }
}
