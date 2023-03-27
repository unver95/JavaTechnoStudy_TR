package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin birler ve onlar basamagin esit olup olmadigini bulunuz

        Scanner input = new Scanner(System.in);
        int numb;


        System.out.println("Bir sayi girin: ");
        numb = input.nextInt();

        //1. Cozum
        int birler = numb % 10;
        int onlar = (numb/10)%10; //456


        // 2. Cozum
/*        int birler = numb % 10;
        int onlar = (numb / 100) % 10;

        if (birler == onlar) {
            System.out.println("esittir");
        }
        if (birler != onlar) {
            System.out.println("Esittir degildir");
        }
        */
    }
}