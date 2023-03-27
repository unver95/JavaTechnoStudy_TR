package Gun33___OOP_Encapsulation._01_Ornek;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        //kisi1.ad = "ismet";
        //kisi1.soyad = "temur";
        //kisi1.yas = -1;
        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-25);
        System.out.println(kisi1.yasVer());

        System.out.println("kisi1 = " + kisi1);
    }

    // degiskene direk erisimi kapatip
    // bir metod ile korumali veri gonderme ve alma
    // islemine Encapsulation denir

    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.
}
