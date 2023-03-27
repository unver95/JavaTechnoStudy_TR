/*
1-

String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple

Apple elemanının bu Array'a ait olup olmadığını kontrol edin.

Eğer aitse "true" çevirin.



2-

int Array oluşturun ve elemanları : 12,2,5,15,8

En büyük değeri yazdırınız.



3-

int Array oluşturun ve elemanları : 14 , 19 , 5 , 21

En küçük (minimum) sayıyı yazdırınız.



4-

int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30

Arraydaki en büyük 2. elemanı yazdıran bir program yazın.



5-

int Array oluşturun ve elemanları : 5,6,8,12,14,19

Eğer sayı çiftse topla, tekse çıkar.

**Örneğin:**

 **-5 + 6 + 8 + 12 + 14 - 19 = 16**

Toplamlarını yazdırın.



7-

Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.



 Oluşturacağınız int array'i =   ([1, 2, 3, 4])

Sonuç bu şekilde olmalıdır. [1, 4]



8-

int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4

Array'in ortalamasını alınız.



9-

String Array (Dizi) oluşturunuz.

 elemanları : Apple, Orange , Babana, Kiwi

Array'leri tüm elemanları yazdırınız.



10-

String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"

Array'daki eleman sayısını yazdırınız.

Cevap 4 olmalı.



11-

İnt Array oluştur ve elemanları   : 25,30,30,35,100

Array in elemanlarının toplamını yazdır.

Cevap 220 olmalı.



12-- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
/Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.

13: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
ayrı bir döngüde en büyük ve en küçük rakamın farkını bulunuz.

14: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
ayrı bir döngüde çift rakam sayısını bulunuz ve yazdırınız
*/
package Gun16_Hafta_5___JavaArray;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        /************************* 1. Soru **************************************/
        String[] meyveler = {"Orange", "Banana", "Pineapple", "Apple"};
        boolean dogruMu = false;


        for (int i = 0; i < meyveler.length; i++) {
            // System.out.println(meyveler[i]=="Apple");
            if (meyveler[i] == "Apple") {
                dogruMu = true;
            }
        }
        System.out.println("1. Soru Dogru mu: " + dogruMu);


        /************************* 2. Soru **************************************/

        int[] enBuyukSayilar = {12, 2, 5, 15, 8};
        int enBuyuk = enBuyukSayilar[0];

        for (int i = 0; i < enBuyukSayilar.length; i++) {
            if (enBuyukSayilar[i] > enBuyuk) {
                enBuyuk = enBuyukSayilar[i];
            }
        }
        System.out.println("2. Soru. En buyuk sayi: " + enBuyuk);


        /************************* 3. Soru **************************************/

        int[] enKucukSayilar = {14, 19, 5, 21};
        int enKucuk = enKucukSayilar[0];

        for (int i = 0; i < enKucukSayilar.length; i++) {
            if (enKucuk > enKucukSayilar[i]) {
                enKucuk = enKucukSayilar[i];
            }
        }
        System.out.println("3. Soru. En kucuk sayi: " + enKucuk);

        /************************* 4. Soru **************************************/

        int x;
        int numb[] = {15, 25, 22, 18, 30};

        for (int i = 0; i < numb.length; i++) {
            for (int j = i + 1; j < numb.length; j++) {

                if (numb[i] > numb[j]) {
                    x = numb[i];
                    numb[i] = numb[j];
                    numb[j] = x;
                }
            }
        }
        System.out.println("Ikinci en buyuk sayi: " + numb[numb.length - 2]);

        /************************* 5. Soru **************************************/
        int[] numbs = {5, 6, 8, 12, 14, 19};
        int t = 0;
        int c = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                t += numbs[i];
            } else {
                c -= numbs[i];
            }
        }
        System.out.println("Toplam Sonuc: " + t);
        System.out.println("Cikan sonuc: " + c);

        /************************* 7. Soru **************************************/
        int[] s = {1, 2, 3, 4};
        int[] yS = new int[2];

        yS[0] = s[0];
        yS[1] = s[s.length - 1];
        System.out.println(yS[0] + " ve " + yS[1]);

        /************************* 8. Soru **************************************/
        int[] n = {12, 14, 21, 23, 10, 4};
        int ort = 0;

        for (int i = 0; i < n.length; i++) {

            ort += n[i];

        }
        System.out.println(ort / n.length);

        /************************* 9. Soru **************************************/
        String[] fruits = {"Orange", "Banana", "Kiwi", "Apple"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        /************************* 10. Soru **************************************/
        String[] city = {"new jersey", "new york", "boston", "California"};
        System.out.println("8.Soru: " + city.length);

        /************************* 11. Soru **************************************/
        int[] n2 = {25, 30, 30, 35, 100};
        int toplam = 0;

        for (int i = 0; i < n2.length; i++) {
            toplam += n2[i];
        }
        System.out.println("9.Soru cevap: Toplam: " + toplam);

        /************************* 12. Soru **************************************/
        Scanner input2 = new Scanner(System.in);
        String[] kelime = new String[5];
        int enUzun = 0;
        String enUzunKelime = "";
        char ilkHarf, sonHarf;
        char temp = ' ';

        for (int i = 0; i < kelime.length; i++) {
            System.out.print("Kelime yaz: ");
            kelime[i] = input2.nextLine();
        }
        for (int i = 0; i < kelime.length; i++) {
            if (kelime[i].length() > enUzun) {
                enUzun = kelime[i].length();
                enUzunKelime = kelime[i];
            }
        }
        ilkHarf = enUzunKelime.charAt(0);
        sonHarf = enUzunKelime.charAt(enUzunKelime.length() - 1);
        temp = ilkHarf;
        ilkHarf = sonHarf;
        sonHarf = temp;
        System.out.println(ilkHarf + enUzunKelime.substring(1, enUzunKelime.length() - 1) + sonHarf);

        //****** GELISMIS VERSIYON (BURAK YAPTI)******//
        {
  //          Scanner strInput = new Scanner(System.in);
  //          String[] kelime = new String[2];
  //          int maxLength = 0;
  //          String enUzunKelime = null;
  //          String ilkHarf = null;
  //          String sonHarf = null;
//
  //          for (int i = 0; i < kelime.length; i++) {
  //              System.out.println("Kelime gir");
  //              String k = strInput.nextLine();
  //              kelime[i] = k;
//
  //              if (kelime[i].length() > maxLength){
  //                  maxLength = kelime[i].length();
  //                  enUzunKelime = kelime[i];
  //              }
  //          }
  //          System.out.println(maxLength);
  //          System.out.println(enUzunKelime);
  //          System.out.println("Ilk harf: " + enUzunKelime.charAt(0));
  //          System.out.println("Son harf: " + enUzunKelime.charAt(enUzunKelime.length()-1));
  //      }
  //  }
        }
        //****** GELISMIS VERSIYON (BURAK YAPTI)******//
        /************************* 13. Soru **************************************/
        Scanner keyInput = new Scanner(System.in);
        int[] eleman = new int[10];
        int enBuyuk1 = 0;
        int enKucuk1 = 0;

        for (int i = 0; i < eleman.length; i++) {
            System.out.print("10 tane sayi: ");
            eleman[i] = keyInput.nextInt();
        }
        for (int i = 0; i < eleman.length; i++) {
            if(eleman[i] > enBuyuk1){
                enBuyuk1 = eleman[i];
            }if(eleman[i] < enKucuk1){
                enKucuk1 = eleman[i];
            }
        }
        System.out.println(enBuyuk1 - enKucuk1);

        /************************* 14. Soru **************************************/
        Scanner src = new Scanner(System.in);
        int[] eleman1 = new int[5];
        int sayac= 0;

        for (int i = 0; i < eleman1.length; i++) {
            System.out.println("10 tane rakam gir: ");
            eleman1[i] = src.nextInt();

            if (eleman1[i] % 2 == 0) {
                sayac++;
            }
        }
        System.out.println(sayac +" tane cift sayi vardir. ");
    }
}
