package Gun37_Interface.Soru6_Gercek_Cozum;

import Utility.MyFunc;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen();
        System.out.println(d.alan(4,5));
        System.out.println(d.cevresi(4,5));

        Kare k = new Kare();
        System.out.println(k.alan(4));
        System.out.println(k.cevresi(4));

        Daire yuvarlak = new Daire();
        System.out.println(yuvarlak.cevresi(6));
        System.out.println(yuvarlak.alan(9));

        Daire dr = new Daire();
        System.out.println("dr.alan(3) = " + dr.alan(3));
        System.out.println("dr.cevres(4) = " + dr.cevresi(3));

        double yeniSayi = MyFunc.yuvarla(dr.cevresi(3));
        System.out.println("yeniSayi(3) = " + yeniSayi);

        System.out.printf("8%.2f", dr.cevresi(3));
        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gözteriyor
        // .  : ondalıklı bölümü gösteriyor
        // 8  : toplamda ekrandan kaç digit kullanılacak (Kac tane alan kapliyor Ornek: "   18.85" bosluk koydu cunku toplam 6 oldu. bosluk sagda olmasi icin 8-% yapmak lazim "18.85   "
        // 2  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.
    }
}
