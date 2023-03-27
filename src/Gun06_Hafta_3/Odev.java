/*
1-

**I love java** olan bir String oluşturun.

 Bu cümlenin toplam karakter sayısını yazdırın.

2-

**Sprint planning** olan bir String oluşturun.

Bu dizenin _toplam karakter sayısını_ yazdırın.

3-

**apple** olan bir String oluşturun.

String'in _içinde_ **app** olup olmadığını **doğrula**.

4-

**orange** kelimesinden oluşan bir String oluşturun.

 String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

5-

**apple**  olan  bir String oluşturun.

String'in **apple**'a _eşit_ olup olmadığını doğrulayın.

_Büyük harf veya küçük harf önemli değildir._

6-

**Florida** kelimesinden bir String oluşturun.

Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

7-

**Thank you** olan bir String oluşturun.

Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

8-

**SirketMain method** oluşturun.

**Mouse** değerinde bir String oluştur.

Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.


ÖZEL SORULAR

10 -  3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
*/


package Gun06_Hafta_3;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


        /******************************Soru 1******************************/
        String cumle = "I love Java";

        System.out.println(cumle.length());

        /******************************Soru 2******************************/
        String kelime = "Sprint planning";

        System.out.println(kelime.length());

        /******************************Soru 3******************************/
        String meyve = "Apple";

        System.out.println(meyve.contains("app"));

        /******************************Soru 4******************************/
        String turuncu = "Orange";

        System.out.println(turuncu.equals("Apple"));

        /******************************Soru 5******************************/
        String meyve2 = "apple";

        System.out.println(meyve2.equalsIgnoreCase("Apple") + " " + meyve2.equalsIgnoreCase(meyve)); // "Apple" ve yukari daki Stringe esit mi diye baktik

        /******************************Soru 6******************************/
        String state = "Florirda";

        System.out.println(state.indexOf('o'));

        /******************************Soru 7******************************/
        String sagol = "Thank you";

        System.out.println(sagol.indexOf('y'));

        /******************************Soru 8******************************/

        main("mouse");

        /******************************Soru 10******************************/ //9.cu soru bende gozukmedigi icin orayi atladim.
        Scanner input = new Scanner(System.in);
        String fullIsim;

        System.out.println("Isim orta isim ve soyisim: ");
        fullIsim = input.nextLine();

        char ilkHarf = fullIsim.charAt(0);
        int boslukBul = fullIsim.indexOf(" ");
        char ortaIsim = fullIsim.charAt(boslukBul + 1);
        int boslukBul2 = fullIsim.lastIndexOf(" ");
        char soyIsimIlk = fullIsim.charAt(boslukBul2 + 1);

        System.out.println(ilkHarf + "." + ortaIsim + "." + soyIsimIlk + ".");

    }

    /******************************Soru 8******************************/
    public static void main(String x) {

        System.out.println(x.charAt(3));
    }
}
