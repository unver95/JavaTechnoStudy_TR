package Gun33___OOP_Encapsulation.Gunun_Sorusu.Benim;

import java.util.ArrayList;

public class Okul {

    private String okulAd;
    final int kontenjan = 2;
    final int yasSiniri = 15;

    private ArrayList<Ogrenci> ogrenciArrayList;

    Okul(String okulAd,ArrayList<Ogrenci> ogrenciArrayList) {
        setOkulAd(okulAd);
        setOgrenciArrayList(ogrenciArrayList);
    }


    public void setOkulAd(String ad) {
        this.okulAd = ad;
    }

    public String getOkulAd() {
        return okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public int getYasSiniri() {
        return yasSiniri;
    }

    public void setOgrenciArrayList(ArrayList<Ogrenci> ogrenciArrayList){
        this.ogrenciArrayList=ogrenciArrayList;
    }
    public ArrayList<Ogrenci> getOgrenciArrayList() {
        return ogrenciArrayList;
    }
}