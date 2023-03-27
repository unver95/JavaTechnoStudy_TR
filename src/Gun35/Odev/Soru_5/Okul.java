package Gun35.Odev.Soru_5;

import java.util.ArrayList;

public class Okul {

    private String isim;
   private int maxOgrenciSayisi;
   private ArrayList<Ogrenci> ogrList;
   private ArrayList<Calisanlar> clsList;



    Okul(String isim, int OgrenciSayisi, ArrayList<Ogrenci> ogrList, ArrayList<Calisanlar> clsList){
        setIsim(isim);
        setMaxOgrenciSayisi(OgrenciSayisi);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        setOgrList(ogrList);
        setClsList(clsList);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi){
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }
    public int getMaxOgrenciSayisi(){
        return this.maxOgrenciSayisi;
    }

    public void setOgrList(ArrayList<Ogrenci> ogrList){
        this.ogrList = ogrList;
    }
    public ArrayList<Ogrenci> getOgrList(){
        return this.ogrList;
    }

    public void setClsList(ArrayList<Calisanlar> clsList){
        this.clsList = clsList;
    }
    public ArrayList<Calisanlar> getClsList(){
        return this.clsList;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrList=" + ogrList +
                ", clsList=" + clsList + "\n";
    }
}
