/*
Özel sorular

1- Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
sayı olup olmadığını bulunuz

2- Aşağıdaki do-while döngüsüne denk  while döngüsü hangisidir?

do {
  x = x + y;
} while (x < z);



3. Aşağıdaki for döngüsüne denk while döngüsü hangisidir?  (başlangıçta toplam=0 varsayın)

for (i = 1; i <= 100; i = i + 1)
    toplam = toplam + i;

4- Aşağıdaki çıktıyı veren programı yazınız
     *****
      ****
       ***
        **
         *

5- Aşağıdaki çıktıyı veren programı yazınız
     **********
      ********
       ******
        ****
         **
*/

package Gun15;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        // 1- Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        // sayı olup olmadığını bulunuz
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayi girin, simetrik olup olmadigini bulacak");
        sayi = input.nextInt();

        int sayininIlkHali = sayi;
        int basamak;
        int toplam = 0;
        //24173
        //20000 + 4000 + 100 + 70 + 3

        while (sayi > 0) {
            basamak = sayi % 10;
            toplam += basamak;
            while (sayi > 10) {
                toplam *= 10;
                break;
            }
            sayi /= 10;
        }
        if (toplam == sayininIlkHali) {
            System.out.println("Simetrik sayidir");
        } else System.out.println("Simetrik degil");

        /********************* 2.Soru **********************/
        int x = 0, y = 1, z = 2;
        while (x < z) {
            x += y;
        }

        /********************* 3.Soru **********************/
        int toplam2 = 0;
        int i = 1;

        while (i <= 100) {
            toplam2 += i;
            i++;
        }

        /********************* 4.Soru **********************/
        for (int s = 0; s <= 5; s++) {
            for (int t = 0; t < s; t++) {
                System.out.print(" ");
            }
            for (int b = 5; b > s; b--) {

                System.out.print("*");

            }
            System.out.println();
        }
        /********************* 5.Soru **********************/
        for (int q = 0; q < 5; q++) {
            for (int j = 0; j < q; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > q; k--) {
                System.out.print("*");
            }
            for (int k = 5; k > q; k--) {
                System.out.print("*");
            }
            for (int l = 0; l < q; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


