package Gun19___2D_JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Gunun_Sorusu_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra ö sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.


        int[][] sayilar = new int[3][2];

        Scanner oku = new Scanner(System.in);
        int tekSayaci = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print("sayi girin: ");
                sayilar[i][j] = oku.nextInt();
                if (sayilar[i][j] % 2 == 1) {
                    tekSayaci++;
                }
            }
        }
        int[] Tekler = new int[tekSayaci];
        int tekinIndexi =0;
        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j] % 2 == 1) {
                    Tekler[tekinIndexi]=sayilar[i][j];
                    tekinIndexi++;
                }
            }
        }
        System.out.println("Tekler: "+Arrays.toString(Tekler));

    }
}
