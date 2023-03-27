/*
1-

Ismi **randomNum** olan bir method oluşturun.

Parametre olarak **int max** almalı.

Bu method, 0 ile max arasında random bir değer döndürmelidir.

Random numarayı döndürünüz.




2-

"OrtaKelime" isminden bir method oluşturun.

Bu method String'i parametre olarak almalı.

Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.

Ortadaki kelimeyi return yapınız.

Örnek: Ben Java'yı seviyorum.

print : Java'yı

Örnek2:

Java'yı kolayca öğreniyorum.

print: kolayca




3-

reverseString isminde bir method oluşturun.

Bu method bir String'i parametre olarak alsın.

Ve bu method, girilen String'i tersten yazsın.

Terste yazılmış halini yazdırınız.

Örn: String = "Java'yı Seviyorum."

Print: .muroyiveS ıy'avaJ




4-

 adı  reverseWord olan bir method oluşturun

Bu methodun String olarak bir parametresi olmalıdır




Ve bu cümledeki kelimelerle tersine çevirmeli

Ters halini yazdırın.

Örnek 1 :

Dize: Java yazın

dönüş şöyle olmalıdır:  yazın Java

Örnek 2:

Dize: Sakin olun ve evde kalın

dönüş olmalı: kalın evde ve olun sakin




5-

getSum isminde bir method oluşturun.

Parametresi ArrayList'tir.

Dizideki tüm $ ları kaldır ve tüm sayıları topla

return yaptğımız veri tipi 'int' olmalıdır.

sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:

ArrayList = $13, $15, $20

Cevap = 48 olmalı

Örnek 2 :

ArrayList= $-13, $0, $0

Cevap = -1 olmalı.




6-
// TODO DAHA SONRA BAK GUZEL SORU
EvenOddNums isminde bir method oluşturun.

Bu yöntem String olan bir parametreyi kabul etsin.

Bu String'de 1234567890 gibi 10 haneli sayılar olacak.

Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.

toplam sonucu yazdırın.

**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**

For example Örnek:

String =  "6678421312"

6+6-7+8+4+2-1-3-1+2

sonuç 16 olmalı




7-

addDigits isminde bir method oluşturun.

Parametresi int

Return tipi de int

Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.

Tek basamaklı çıktığında, döndürün

**Örnek1:**

```
**Girdi** `38`
**Çıktı:** 2
**Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
             2 , tek basamaklı olduğundan, bunu döndürün.
```




8-

powerOfThree isminde bir method oluşturun.

Parametre olarak int

Return tipi boolean

Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.

**Örnek 1:**

```
**Girdi:** 27
**Çıktı:** true
```

```
Açıklama: 3*3*3 =27
```

```
Sonuç= true

```

**Örnek 2:**

```
**Girdi:** 0
**Çıktı:** false
```

**Örnek 3:**

```
**Girdi:** 9
**Çıktı:** true
```




9-

Write a method called `append`

`append adında bir method oluşturun.`

`Parametre olarak iki int array  oluşturun.`

 ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.

 Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,

Bunu döndürmelidir:

 {2, 4, 6, 1, 2, 3, 4, 5}.

#




10-




**isUnique** adında bir method oluşturun.

Parametre olarak int array alır.

 ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).

örneğin, list isminde bir array'imiz varsa,

```
int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
```

Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.

```
int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
```

Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

11- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız. Dizideki en küçük ve enbüyük elemanları bir fonksiyonda buldurup maın de arasındaki farkı bulunuz.

12-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.

     sonrasında bir fonksiyonda  bütün RAKAMLARI toplayıp toplam para değerini bulunuz, toplam parayı main de yazdırınız.
*/

/* TODO***********************************...TODO KALITELI ODEV SORUSU BUNLAR TEKRAR EDILMESI GEREK...*******************************TODO// */
package _05_IQ_Sorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Guzel_Odev {
    public static void main(String[] args) {
        /*****************************************1.Soru*********************************************/
        int cevap = randomNum(10);

        System.out.println(cevap);

        System.out.println();

        /*****************************************2.Soru*********************************************/
        String kelime = "Senna Java Ogreniyor";
        System.out.println(ortaKelime(kelime));

        System.out.println();

        /*****************************************3.Soru*********************************************/

        String oyun = "Pack-Man cok iyi bir oyun";
        reverseString(oyun);

        System.out.println();


        /*****************************************4.Soru*********************************************/

        String tersCumle = "Senna Akbas Neeko ile oynamayi cok sever";

        reverseWord(tersCumle);

        System.out.println();

        /*****************************************5.Soru*********************************************/

        String[] para = {"$13", "$15", "$20"};
        System.out.println(getSum(para));

        /*****************************************6.Soru*********************************************/
        String onHaneliRakam = "6678421312";
        System.out.println(EvenOddNums(onHaneliRakam));

        /*****************************************7.Soru*********************************************/
        Scanner input = new Scanner(System.in);
        System.out.println("7. Soru " + "Lutfen bir tamsayi yazin");
        int sayi = input.nextInt();

        int sayac = 1;

        while (sayi > 9) {
            sayi = basamakTopla(sayi);
            System.out.println(sayac + ". toplam = " + sayi);
            sayac++;
        }

        System.out.println("Yazdiginiz sayinin basamaklarin toplami = " + sayi);

        /*****************************************8.Soru*********************************************/
        int sayi2 = 6;
        System.out.println(powerOfThree(sayi2));

        /*****************************************9.Soru*********************************************/

        int[] dizi1 = new int[]{39, 18, 3, 103};
        int[] dizi2 = new int[]{92, 3, 12, 69};
        System.out.println("Soru 9: " + Arrays.toString(append(dizi1, dizi2)));

        /*****************************************10.Soru*********************************************/
        int[] diziler = {69, 321, 425, 89, 69};
        System.out.println(isUnique(diziler));

        /*****************************************11.Soru*********************************************/
        int[] dizi = new int[4];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin icini doldurun(4 elemanli): ");
            dizi[i] = input.nextInt();
        }
        int[] sondurum = enKucukEnBuyuk(dizi);
        System.out.println(sondurum[0] - sondurum[1]);

        /*****************************************12.Soru*********************************************/
        Scanner keyboard = new Scanner(System.in);
        String[][] fiyatlar = new String[2][3];



        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {
                System.out.print("$ sekilde fiyatlari girin: ");
                fiyatlar[i][j] = keyboard.nextLine();
            }
        }
        System.out.println(paralarinToplammi(fiyatlar));
    }


    /*****************************************1.Soru Metotu*********************************************/
    public static int randomNum(int max) {
        max = (int) (Math.random() * max);
        return max;
    }

    /*****************************************2.Soru Metotu*********************************************/
    public static String ortaKelime(String cumle) {
        int ilkBosluk = cumle.indexOf(" ");
        int ikinciBolsuk = cumle.indexOf(" ", ilkBosluk + 1);
        cumle = cumle.substring(ilkBosluk + 1, ikinciBolsuk);
        return cumle;
    }

    /*****************************************3.Soru Metotu*********************************************/
    public static String reverseString(String ters) {
        for (int i = ters.length() - 1; i >= 0; i--) {
            System.out.print(ters.charAt(i));
        }
        System.out.println();
        return ters;
    }

    /*****************************************4.Soru Metotu*********************************************/
    public static String reverseWord(String TersCumle) {

        String[] parcali = TersCumle.split(" ");
        for (int i = parcali.length - 1; i >= 0; i--) {
            System.out.print(parcali[i] + " ");
        }
        return TersCumle;
    }

    /*****************************************5.Soru Metotu*********************************************/
    public static int getSum(String[] str) {

        int toplam = 0;
        String sade;

        for (int i = 0; i < str.length; i++) {
            sade = str[i].replace("$", "");
            int rakam = Integer.parseInt(sade);
            toplam += rakam;
        }
        if (toplam >= 0) {
            return toplam;
        } else {
            return -1;
        }
    }

    /*****************************************6.Soru Metotu*********************************************/

    public static int EvenOddNums(String str) {
        int sayi;
        int toplam = 0;


        String[] arraySAyi = str.split("");
        for (int i = 0; i < str.length(); i++) {
            sayi = Integer.parseInt(arraySAyi[i]);
            if (sayi % 2 == 0) {
                toplam += sayi;
            } else {
                toplam -= sayi;
            }
        }
        return toplam;
    }

    /*****************************************7.Soru Metotu*********************************************/
    public static int basamakTopla(int sayi) {
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }

    /*****************************************8.Soru Metotu*********************************************/
    public static boolean powerOfThree(int sayi) {
        boolean kuvvetMi = false;

        while (sayi > 1) {
            if (sayi % 3 == 0) {
                kuvvetMi = true;
            } else {
                kuvvetMi = false;
                break;
            }
            sayi /= 3;
        }

        return kuvvetMi;
    }

    /*****************************************9.Soru Metotu*********************************************/
    public static int[] append(int[] dizi1, int[] dizi2) {
        int[] birlesmisHali = new int[dizi1.length + dizi2.length];

        for (int i = 0; i < dizi1.length; i++) {
            birlesmisHali[i] = dizi1[i];
        }
        for (int i = 0; i < dizi2.length; i++) {
            birlesmisHali[dizi1.length + i] = dizi2[i];
        }
        return birlesmisHali;
    }

    /*****************************************10.Soru Metotu*********************************************/
    public static boolean isUnique(int[] dizi) {
        boolean benzerMi = true;


        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    benzerMi = false;
                }
            }
        }
        return benzerMi;
    }

    /*****************************************11.Soru Metotu*********************************************/
    public static int[] enKucukEnBuyuk(int[] dizi) {
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }
        int[] geriDonus = {enBuyuk, enKucuk};
        return geriDonus;

    }

    /*****************************************11.Soru Metotu*********************************************/
    public static int paralarinToplammi(String[][] sayi) {
        String sade;
        int sayiHali;
        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                sade = sayi[i][j].replace("$", "");
                sayiHali = Integer.parseInt(sade);
                toplam += sayiHali;
            }
        }
        return toplam;
    }
}
