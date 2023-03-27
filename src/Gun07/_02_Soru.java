package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadin (tam ad) adini ve soyadini ayirip, ayri ayri yazdiriniz

        Scanner oku = new Scanner(System.in);
        String tamAd;


        System.out.println("Adiniz ve soyadiniz: ");
        tamAd = oku.nextLine();

        // Burak Unver -> boslugun indexini bulurum buna gore ayirim
        int boslukIndex = tamAd.indexOf(" "); // bosluk degerini alir
        String ad = tamAd.substring(0, boslukIndex);

        // Soyad icin
        String soyad = tamAd.substring(boslukIndex+1); //Bosluktan 1 sonra so 1+ oldugu icin.

        System.out.println("ad: " + ad);
        System.out.println("soyad: " + soyad);
    }
}
