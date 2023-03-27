package Gun23___2D_ArrayList;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
    /*
    int sayi=5;                                  // tek bir rakam tutabilen değişken
    int[] dizi=new int[20];                      // 20 adet sayi tutabilen değişken, uzunluk sabit
    int[][] tablo=new int[20][2];                // 20x2 lik sayı saklayabilen değişken, uzunluk sabit

    ArrayList<Integer> liste=new ArrayList<>();  // istenildiği kadar sayı eklenebilen değişken, uzunluk değişken
    */

        // 3 Ogrencinin ders notlarini bir degiskende nasil birlestiriniz.
        ArrayList<Integer> matNotlari = new ArrayList<>();  // Tek bir dersin notlari  // 1 yaprak
        ArrayList<Integer> fizNotlari = new ArrayList<>();  // Fiz dersinin notlari    // 1 yaprak
        ArrayList<Integer> kimNotlari = new ArrayList<>();  // Kim dersinin notlari    // 1 yaprak

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);

        //Arraylist in ArrayList nasil yaparim.
        ArrayList<ArrayList<Integer> > notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        //Butun ders notlari notlar listesinde su anda, yani Arraylistlerin listesi

        notlarListesi.get(0);        // matnotlari her bir elemani listesi cunku
        int matbitNot = notlarListesi.get(0).get(0);    // 0.listenin 0. elemani, mat in 1. notu
        System.out.println(matbitNot);

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0)); // 0.Listeyi verir
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1)); // 1.Listeyi verir
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2)); // 2.Listeyi verir

        // Yukaridakilerin yerine bu dongu
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(i));

        }

        for (int i = 0; i < notlarListesi.size(); i++) {

            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // Her satirdaki sutunlari
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}
