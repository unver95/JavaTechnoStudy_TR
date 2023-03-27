package Projeler._1_Proje_Banka.bankAccount;

public class KefilEkle {


    // 5. Adım
//       String tipinde tamAd ve yas adında iki adet değişken oluşturun.

    String tamAd;
    String yas;

//----------------------------------------------------------------------------------------------------------------------

    // 6. Adım
//    --- Parametresi iki adet String tamAd ve yas olan KefilEkle classından constructor oluşturun.
//        Constructor da classın ve parametrenin değişkenlerini eşitleyin.
//
//        Eğer yas ı 18 e eşit veya büyük ise  class değişkenindeki yas eşittir  parametredeki yasa. (KefilYasKontrol() methodunu kullan)
//        Eğer yas 18 den küçük ise class değişkenindeki yas eşittir "0" olmalıdır.

    public KefilEkle(String tamAd, String yas) {
        this.tamAd = tamAd;
        this.yas = yas;
        if (KefilYasKontrol(yas)) {
            this.yas = yas;
        }
        else this.yas = "0";
    }

//----------------------------------------------------------------------------------------------------------------------

    // 7. Adım
//       --- Parametresi String kefilYas ve return tipi boolean olan
//           KefilYasKontrol()  methodunu oluşturun
//       --- Eğer kefilYas 18 den büyük veya eşit ise "true" return et.
//           18 den küçük ise "false" return et
//           (Musteriler classından yasKontrol() methodunu kullanın)

    public static boolean KefilYasKontrol(String kefilYas) {

        return Musteriler.yasKontrol(kefilYas).equals("Kredi kartı alabilirsiniz.");
    }

//----------------------------------------------------------------------------------------------------------------------

}
