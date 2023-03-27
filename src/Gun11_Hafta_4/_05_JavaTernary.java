package Gun11_Hafta_4;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Sayi girin");
        sayi = input.nextInt();

        System.out.println((sayi ==0) ? "sifir" :(sayi <0) ? "negatif" : "pozetif");
    }
}
