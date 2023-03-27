package Gun23___2D_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {

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
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari); // Matematik notlari burda
        notlarListesi.add(fizNotlari); // Fizik notlari burda
        notlarListesi.add(kimNotlari); // Kimya notlari burda

        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // Her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik     : 30 40
        // Kimya     : 70 80 90 100

        ArrayList<String> dersAdlari = new ArrayList<>();
        dersAdlari.add("Matematik");
        dersAdlari.add("Fizik");
        dersAdlari.add("kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {

            System.out.print(dersAdlari.get(i) + " : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }

        System.out.println("******************");
        Scanner oku = new Scanner(System.in);
        System.out.println("0-Mat, 1-Fiz, 2-Kim");
        int dersNo = oku.nextInt();

        dersNotlariniYazdir(dersNo, notlarListesi);  // tod0 soru1
    }

    public static void dersNotlariniYazdir(int dersNo, ArrayList<ArrayList<Integer>> notlarListesi) {
        // Ders no belli oldugundan dersleri saydiran for a ihtiyacim yok, bu deger belli dersNo.
        for (int j = 0; j < notlarListesi.get(dersNo).size(); j++) {
            System.out.println(notlarListesi.get(dersNo).get(j));
        }
    }
// TODO :  Soru 1 :Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız
    //         Soru 2 :Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
    //         Soru 3 :Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.
    //         Soru 4 :En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon zorunlu değil).
}