package Gun19___2D_JavaArray;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 luk bir tabloyu kullanicidan sayi alarak doldurunuz
        // Daha sonra ayri bir dongu de en buyuk sayiyi bulunuz

        Scanner input = new Scanner(System.in);
        int sayi;
        int[][] tablo = new int[2][3];
        int enBuyuk = 0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(i + "," + j + ". Sayi giriniz: ");
                tablo[i][j] = sayi = input.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                if (tablo[i][j] > enBuyuk) {
                    enBuyuk = tablo[i][j];
                }
            }
        }


        System.out.println(enBuyuk);

    }
}
