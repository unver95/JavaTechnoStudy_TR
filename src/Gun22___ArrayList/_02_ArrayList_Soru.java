package Gun22___ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz

        // int[] notlar = new int[100] // -> Bu isimizi gormuyor cunku kac not girecegi belli degil.

        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        String devamMi = "";
        int toplam = 0;
        do {
            System.out.print("Not: ");
            int not = okuInt.nextInt();
            notlar.add(not);
            toplam += not;

            System.out.print("Devam etmek istiyormusunuz: (E/H)");
            devamMi = okuInt.next();

        } while (devamMi.equalsIgnoreCase("E"));  // kontrol sonda oldugundan ve kac kere donecegi belli degil

        System.out.println("notlar = " + notlar);

        int ort = toplam / notlar.size();
        System.out.println("ort = " + ort);

        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort) {
                gecenSayisi++;
            }
        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}
