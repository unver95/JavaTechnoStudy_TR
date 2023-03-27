package Gun05;

import java.util.Scanner;

public class _03_Ornek_ {
    public static void main(String[] args) {
        // Kullanicidan Adini ve soyadini alarak ekrana yazdiriniz

        Scanner oku = new Scanner(System.in); //Okuma islemini yapacak olan degisken tanimla

        System.out.println("Adinizi soyAdinizi: "); // Okuma islemini yapacak olan degisken tanimlandi

        String isim;
        isim = oku.nextLine(); // Okuma bu noktada yapiliyor
        System.out.println(isim); // verinin gercekten okunabildigi tekrar ekrana yazarak kontrol ettim
    }
}
