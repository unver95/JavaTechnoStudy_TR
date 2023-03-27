package Gun33___OOP_Encapsulation.Gunun_Sorusu.Hocanin.Cozumu;

import java.util.ArrayList;

public class Okul {
    private  String okulAd;        //encapsulation
    private int kontenjan;

    ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>();

    public Okul (String okulAd, int kontenjan){
        setOkulAd(okulAd);         //encapsulations
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }
}
