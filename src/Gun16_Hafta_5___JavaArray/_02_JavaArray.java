package Gun16_Hafta_5___JavaArray;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi = 0; // Daha once degiskeni bu sekilde tanimliyorduk, 1 tane yer acti hafsasinda

        int[] dizi = new int[5]; // 0,1,2,3,4 index li 5 adet sayilik yer acti hafizada

        dizi[0] = 5;
        dizi[1] = 56;
        //  dizi[5]=45; // bu OLMAZ, en son 4 olabilir, 0,1,2,3,4

        System.out.println("dizi.length = " + dizi.length); // bu bana kac eleman oldugunu verir.

        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi giriniz: ");
            dizi[i] = oku.nextInt();
        }

        System.out.println("Dizi: " + dizi[4]);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }


    }
}
