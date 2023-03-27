package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanicidan Adini ve soyadini alip ayri okutup birlikte ekrana yazdir

        Scanner oku = new Scanner(System.in);
        String ad;
        String Soyad;

        System.out.print("Adinizi: ");
        ad = oku.nextLine();
        System.out.print("Soyadiniz: ");
        Soyad = oku.nextLine();


        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + Soyad);
        System.out.print(ad + Soyad);
    }
}
