package Gun45._01_VeriTipleri;

import java.util.Arrays;

public class _01_VeriTipleriMetodda {
    public static void main(String[] args) {

        // ilkel tip : Primitive kucuk int boolean double falan filan
        int sayi = 5;    // => @065
        sayiArtir(sayi);
        System.out.println("sayi: " + sayi);

        sayi = sayiArtir2(sayi);  // => @066
        System.out.println("Sayi: " + sayi);

        // referans tip : referance type
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("dizi: " + Arrays.toString(dizi));

        //nesne TIP, NULL alabilen ilkel tip. : object type

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider. Esitlendiginde sadece deger aktarilir
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Esitlemelerede referanslar esitlenir

        // Eşit mi
        // ilkel tiplerde  == ve equals farketmez değerler karşılaştırılır.
        // Referance ve Nesne tipler için  eşitlik kontorlünde   "=="       in manası  referansları aynı mı demek
        // Referance ve Nesne tipler için  eşitlik kontorlünde   "equals"   in manası ise değerleri aynı mı demek

    }

    public static void sayiArtir(int sayi) {  // ilkel tipler aktarilan degerdir
        sayi += 1;
    }

    public static int sayiArtir2(int sayi) { // ilkel tipler aktarilan degerdir
        sayi += 1;
        return sayi;
    }

    public static void diziSifirla(int[] a) {  // referans tiplerin metodlara adresi gider, yani kendisi, bu yuzden return e ihtiyaci yoktur
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
    }

    public static void kelimeSifirla(String kelime) {   // Nesne tip oldugundan ilkel tip gibi davranir, yani degeri gelir, kendisi degil
        kelime = "";
    }
}
