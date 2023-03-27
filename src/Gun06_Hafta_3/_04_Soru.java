package Gun06_Hafta_3;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdiriniz.

        /*
        Scanner input = new Scanner(System.in);
        String cumle;

        cumle = input.nextLine();

        System.out.println(cumle.charAt(cumle.length()-1));
        */

        Scanner oku = new Scanner(System.in);
        String girilen;
        System.out.println("Bir string giriniz: ");
        girilen = oku.nextLine();

        // 01234
        // Bugun uzunluk =5        uzunluk -1 ile son karaktere ulasirim.
        //1. Yol uzun yol
        int uzunluk = girilen.length();
        char sonHarf = girilen.charAt(uzunluk-1);
        System.out.println(sonHarf);


        //2. Yol kisa yol
        System.out.println("Son harf: " + girilen.charAt(girilen.length()-1));

    }
}
