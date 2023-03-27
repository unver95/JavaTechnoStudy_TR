package Gun22___ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array: Boyut sayisi belli ve sonradan boyutu degistirilmez
        int[] dizi = new int[5];  // Array 5 elemanli boyutu sonradan degistirlimiyor

        // Boyutu dinamik olsa, eleman eklendikce uzasa, sildikce kisalsa.
        // ArrayList: Boyutu basta vermene gerek yok, boyutu 0 basta.
        // Eleman eklendikce artar, sildikce azalir.

        ArrayList<Integer> integerList = new ArrayList<>(); //Tanimlama
        ArrayList<Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        // Integer s1 = 5;   // Hem sayi hem de icinde fonksiyonlar sakliyor. defualt null
        // s1.toString() -> Interger yazdik diye . dan sonra baska seyler gele biliyor
        //int s2 = 6;          // Bu hafifzada sadece rakam saklayabilen bir degisken. Ilkel tip, primitive tip, defual 0
        // s2.toString() OLMAZ


        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Senna");  // Uzunlugu 1.
        isimler.add("Neeko");  // Uzunlugu 2.
        isimler.add("Burak");  // Uzunlugu 3.
        isimler.add("Ali");    // Hep en sonuna ekliyor.

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size()); // -> 4

        isimler.add(1, "Fatih");        // Verielen index e ekliyor, digerlerini kaydiriyor
        System.out.println("isimler = " + isimler);

        isimler.set(1, "Zeynep");
        System.out.println("isimler = " + isimler); // Verilen index  i degistirir yeni yazilan

        isimler.remove("Zeynep"); // elemani bulup siliyor.
        System.out.println("isimler = " + isimler);

        isimler.remove(0);      // 0 indexteki elemani sil.
        System.out.println("isimler = " + isimler);

        int IndexOfKaya;
        IndexOfKaya = isimler.indexOf("Kaya");  // Verilen elemanin indexini verir
        System.out.println("IndexOfKaya = " + IndexOfKaya);


        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).equalsIgnoreCase("Ali")) {
                isimler.remove(i);
            }
        }
        System.out.println("Isimler: " + isimler);


        String ilkEleman = isimler.get(0); // Indexdeki elemani alma sayi = dizi[0]
        System.out.println("ilkEleman = " + ilkEleman);


        isimler.clear(); // hepsini bosaltir
        System.out.println("isimler = " + isimler);
    }
}
