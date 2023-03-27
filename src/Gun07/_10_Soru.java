package Gun07;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz.
        // orneğin 01.02.20   bu strinde kaç tane nokta vardır.

        Scanner oku = new Scanner(System.in);
        System.out.println("Lutfen bilgi giriniz");
        String girilen = oku.nextLine();

        int uzunluk1 = girilen.length();
        girilen = girilen.replace(".","");
        int uzunluk2=girilen.length();

        int noktaSayisi=uzunluk1-uzunluk2;
        System.out.println("Noktasayisi:" + noktaSayisi);
    }
}
