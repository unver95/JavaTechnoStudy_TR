package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        int numb1, numb2;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi girin: ");
        numb1 = input.nextInt();

        System.out.println("Ikinci sayi girin: ");
        numb2 = input.nextInt();
        int toplam = numb1 + numb2;
        System.out.println("Toplam: " + toplam);

        /*
        Yada
        System.out.println("Toplam: " + (numb1 + numb2)); icinde String oldugu icin yaziyi toplamaz yapistirir o yuzden parantez koymak lazim ki parantes icini toplasin once.
        Yada
        System.out.println(numb1 + numb2)
        */
    }
}
