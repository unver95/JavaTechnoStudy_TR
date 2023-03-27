package Gun34___OOP_Inheritance._3Gunun_Sorusu;

public class Calisan {
    private String isim;
    private int maas;
    private int maasKatSayisi;

    Calisan(String isim, int maas, int maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getMaas() {
        return this.maas;
    }

    public void setMaasKatSayisi(int maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }

    public int getMaasKatSayisi() {
        return this.maasKatSayisi;
    }

    public int MaasHesaplama() {
        return this.maas *= maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }
}
