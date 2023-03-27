package Gun06_Hafta_3;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // Girilen bir ad soyadi "Burak Unver" B.U. sekilde yazdiriniz.

        Scanner oku =new Scanner(System.in);
        String tamAd;

        System.out.println("Isim soyisim giriniz: ");
        tamAd = oku.nextLine();

        char ilkHarf = tamAd.charAt(0);
        int boslukIndex = tamAd.indexOf(" ");
        char soyadIlkHarf = tamAd.charAt(boslukIndex+1);

        System.out.println(ilkHarf + "." + soyadIlkHarf + ".");
    }
}
