
package Gun16_Hafta_5___JavaArray;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.
        Scanner input = new Scanner(System.in);


        int[] dizi = new int[7];
        int toplam = 0;
        int adet = 0;
        int ort;

        for (int i = 0; i < dizi.length; i++) { // 012346
            System.out.print((i + 1) + ".sayi: ");
            dizi[i] = input.nextInt();

            toplam += dizi[i];
        }

        ort = toplam / dizi.length;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] > ort && dizi[i] % 2 == 1){
                System.out.println(dizi[i]);
                adet++;
            }
        }
        System.out.println("ort: " + ort);
        System.out.println("adet: " + adet);
    }
}


