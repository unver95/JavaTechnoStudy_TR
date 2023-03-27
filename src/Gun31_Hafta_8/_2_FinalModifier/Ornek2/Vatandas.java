package Gun31_Hafta_8._2_FinalModifier.Ornek2;

public class Vatandas {
    String isim;
    final int tcNo;

    static int sayac = 1;
    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = sayac++;
    }

    public String toString(){
        return "Isim: " + isim + "tcNo: " + tcNo;
    }
}
