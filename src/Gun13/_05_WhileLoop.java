package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar(girilen sayı dahil) olan sayıların
        // toplamını bularak yazdırınız.


        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        System.out.print("sayi girin: ");
        sayi =input.nextInt();

        while(sayi >=0){
            toplam +=sayi;
            sayi--;
        }
        System.out.println(toplam);
    }
}
