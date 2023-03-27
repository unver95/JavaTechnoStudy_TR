package Gun46_Hafta_11;

public class _01_TryCatchFinally {
    public static void main(String[] args) {
        long startTime = 0;
        String str = "";


        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan onceki nokta");
            char ilkHarf = str.charAt(0); // hataa noktasi
            System.out.println("Hatadan sonraki nokta");


        } catch (Exception ex) {
            System.out.println("catch blogu calisti");


        } finally { //try-catch in finally: her zaman calisir
            long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println(gecenSure);
            System.out.println("try - catch bloguyla ilgili son yapilacaklar");
            // hata olsun veya olmasin calisan kisim
            // her zaman calisir
            // islemlerde geriye kalan yapilacaklar bu bolume yapilir.
            // kullanim sebebi her iki durum sonrasi geriye kalan yapilacaklar
            // birlikte olsun diye

        }
        System.out.println("diger calisan kodlar");

        System.out.println("program sonu");
    }
}
