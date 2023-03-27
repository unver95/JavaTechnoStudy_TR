/*
1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz

2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz

3-   100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.

4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.

5- Sayı bulmaca oyununu tam hali ile cözünüz. kullanıcıya 10 hak veriniz.
*/
package Gun13;

import java.util.Random;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /***************************  1.Soru  *********************************/
        int sayi;
        int Carpim = 1;
        System.out.print("Bir sayi gir: ");
        sayi = input.nextInt();

        while (sayi >= 1) {
            Carpim *= sayi;
            sayi--;
        }
        System.out.println(Carpim);


        /***************************  2.Soru  *********************************/
        int i = 0;
        int tekToplam = 0;
        int ciftToplam = 0;

        while (i < 100) {
            if (i % 2 == 1) {
                tekToplam += i;
            } else {
                ciftToplam += i;
            }
            i++;
        }
        System.out.println("Tekler: " + tekToplam + "\n" + "Ciftler:" + ciftToplam);

        /***************************  3.Soru  *********************************/
        int j = 100;
        while (j > 0) {
            if (j % 2 == 1) {
                System.out.println(j);
            }
            j--;
        }


        /***************************  4.Soru  *********************************/

        int k = 0;
        while (k <= 100) {
            if (k % 4 == 0 && k % 5 == 0) {
                System.out.println(k);
            }
            k++;
        }
        /***************************  5.Soru  *********************************/

        Random r = new Random();
        Scanner intSayi = new Scanner(System.in);
        int guess;
        int makine;
        int guessCount = 0;
        int guessLimit = 10;
        boolean outOfGuess = false;
        makine = r.nextInt(0, 10);

        System.out.print("Guess the number: ");
        guess = intSayi.nextInt();


        while (makine != guess && !outOfGuess) {
            if (guessCount < guessLimit) {
                System.out.print("Guess the number: ");
                guess = intSayi.nextInt();
                guessCount++;
            } else {
                outOfGuess = true;
            }
        }
        if (outOfGuess) {
            System.out.println("Wrong answer.");
        } else {
            System.out.println("You win!");
        }
    }
}