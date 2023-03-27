package Gun35.Odev.Soru_5;

public class Ogrenci extends Calisanlar {

    private int ucret;

    Ogrenci(String isim, String adres, String okul, int ucret, UveyTipi uveyTipi) {
        super(isim, adres, okul, uveyTipi);
        setUcret(ucret);
        setUcret(ucret);
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getUcret() {
        return this.ucret;
    }

    @Override
    public String toString() {
        return "Ogrenci: " + " isim " + getIsim() + " adres " + getAdres()+
        " ucret: " + ucret + " Uvey tipi " + getUveyTipi() + "\n";
    }
}
