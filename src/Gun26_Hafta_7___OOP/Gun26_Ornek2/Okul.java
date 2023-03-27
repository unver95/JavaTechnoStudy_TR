package Gun26_Hafta_7___OOP.Gun26_Ornek2;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız. Sonra metodda yazdiriniz
        // TODO: sinif ortalamasini bir metodda bulduktan sonra gecen ogrencilerin
        // TODO: ayni metodda isimlerini yazdiriniz.

        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();



        for (int i = 0; i < 20; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.print("okul no:");
            ogr.okulNo = oku.nextInt();

            System.out.print("Tam ad:");
            ogr.tamAd = okuStr.nextLine();

            System.out.print("not:");
            ogr.not = oku.nextInt();

            snf.add(ogr);
        }

        bilgiYazdir(snf);
    }

            // TODO: sinif ortalamasini bir metodda bulduktan sonra gecen ogrencilerin
            // TODO: ayni metodda isimlerini yazdiriniz.

    public static void bilgiYazdir(ArrayList<Ogrenci> snf) {
        for (Ogrenci ogr : snf) {
            System.out.println(ogr.okulNo + " " + ogr.tamAd + " " + ogr.not);
        }
    }
}