package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArrays {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.
        // 2 tane oldugunda da sadece 1 kere VAR yazsin
        // Bulmazsa YOK yazsin
        // Bulduktan sonra DEVAM ETMESIN
        // Varsa 1 kez yoksa 1 kez yazdiriyoruz.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(dizi));

        System.out.print("Sayi giriniz: ");
        int aranaSayi = oku.nextInt();
        boolean Varmi = false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranaSayi) {
                Varmi = true;
            }
        }
        if (Varmi == false) {
            System.out.println("yok");
        } else {
            System.out.println("var");
        }


        //      2.Yol
        /*
           int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println(Arrays.toString(dizi));
        System.out.print("Sayi girin: ");
        sayi = input.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                System.out.println("Dizi de var");
                break;
            }
        }
        if (Arrays.binarySearch(dizi,sayi) < 0){
            System.out.println("dizi de yok");
        }
        */
    }
}