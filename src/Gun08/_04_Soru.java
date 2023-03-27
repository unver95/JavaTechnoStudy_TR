package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir sayinin basamaklarina ayirip yazdir

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("3 basamakli sayi gir: ");
        sayi = input.nextInt();

        // 524 -> 5  2  4  ayri ayri atayabilim
        /*
        524   -> 5 2 4
        524 % 10  -> 4    sayi % 10 => birler basamağını
        524 % 100 -> 24  -> 2 yi nasıl alırım  sonucu 10 a bölerim
        (sayi % 100) / 10 -> 2 => onlar basamağı
        525 / 100 -> 5  -> yüzler basamağını verdi
        */


        int Yuzlerbasamagi = sayi / 100;        // 5
        int onlarBasamagi = (sayi % 100) / 10;  // 2
        int birlerBasamak = (sayi % 10);          // 4

        System.out.println("Yuzlerbasamagi = " + Yuzlerbasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("birlerBasamak = " + birlerBasamak);


    }
}
