package Gun31_Hafta_8._1_StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd = "Yildirim Ilkokulu"; //sen birtanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sinifin, classin degiskeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String toString(){
        return "Ad : " + ad + "Soyad : "+soyad + "Okul ad : " + okulAd;
    }
}
