package Gun31_Hafta_8._2_FinalModifier.Ornek1;

public class Student {
    final  int okulNo;
    String tamAd;

    private static int sayac =1;

    public Student(String tamAd){
        this.okulNo = sayac++;
        this.tamAd = tamAd;
    }

    public String toString(){
        return "Okul: " + okulNo + "tamAd: "+ tamAd;
    }
}
