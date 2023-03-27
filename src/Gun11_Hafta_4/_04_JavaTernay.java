package Gun11_Hafta_4;

import java.util.Scanner;

public class _04_JavaTernay {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Sayi gir: ");
        sayi = input.nextInt();

        System.out.println((sayi >50) ? "1" : "0");
    }
}
