package Utility;

public class MyFunc {
    public static double yuvarla(double gelenSayi) {
        // 18.84955592153876
        // once yuzle carsam -> 1884.955592153876
        gelenSayi = gelenSayi * 100;
        gelenSayi = Math.round(gelenSayi); // 1885
        // tekrar yuze bol -> 18.85
        gelenSayi = gelenSayi / 100;
        return gelenSayi; //18.85

        // TODO: Bu fonksiyona kac hane ondalikli
        // TODO: kisim istediginizi ekleyim


    }

    public static void Bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
