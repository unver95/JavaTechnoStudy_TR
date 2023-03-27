package Gun17;

import java.util.Arrays;
import java.util.Random;

public class _07_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız


        /*******************************1.Yol************************************/
/*
        int[] dizi = new int[100];
        Random r = new Random();
        int tekSayıAdet = 0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(0, 100);
            if (dizi[i] % 2 == 1) {
                tekSayıAdet++;
            }
        }
        int[] teksayilar = new int[tekSayıAdet];
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                teksayilar[j] = dizi[i];
                j++;
            }
        }
        System.out.println("tekler: " + Arrays.toString(teksayilar));
        System.out.println("tana tek sayi var: " + tekSayıAdet);
*/

        /*******************************2.Yol Hoca yolu************************************/
        int[] dizi = new int[100]; // 100 elemanli bir dizi

        for (int i = 0; i < dizi.length; i++)
            dizi[i] = (int) (Math.random() * 100); // 0-100 arasi random

        System.out.println("dizi: " + Arrays.toString(dizi));

        // sonra

        int[] tekler = new int[100]; // bir baska yeni dizi
        System.out.println("tekler:" + Arrays.toString(tekler));
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1)  // sadece tek elemanlarini bir baska yeni diziye atayiniz
                tekler[i] = dizi[i];
        }
        System.out.println("tekler: " + Arrays.toString(tekler));
    }
}

