package Gun33___OOP_Encapsulation.Gunun_Sorusu.Hocanin.Cozumu;

public class Ogrenci {
    private int ID;
    private String ad;
    private String soyad;
    private int yas;

    private  int sayacID = 0;

    public Ogrenci(String ad, String soyad, int yas) {
        this.ID = ++sayacID;  // ++ once artirir solda oldugu icin sonra islem yapar

        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public Ogrenci() {

    }


    public int getID() {
        return ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    //  public static int getSayacID() {
    //      return sayacID;
    //  }

    //  public static void setSayacID(int sayacID) {
    //      Ogrenci.sayacID = sayacID;
    //  }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
