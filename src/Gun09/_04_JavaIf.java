package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Sayi giriniz");
        sayi = input.nextInt();
/*  // 1. cozum
        if(sayi%2==0){
            System.out.println("Girdiginiz sayi ciftir");
        }
        if(sayi%2!=0){
            System.out.println("Girdiginiz sayi cift degildir");
        }

 */
        /* 2. cozum
        int kalan = sayi%2; // mod % bolumunden kalani

        if(kalan == 1){
            System.out.println("tek");
        }
        if (kalan == 0){
            System.out.println("Cift");
        }
*/
        int kalan = sayi % 2; // mod % bolumunden kalani
        if (kalan != 0) { // -1 1 arasi bakiyor
            System.out.println("tek");
        }
        if (kalan ==0){
            System.out.println("cift");
        }
    }
}
