package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girirlen 20 sayidan sadece pozetif olanlarin toplamini bulunuz

        Scanner input = new Scanner(System.in);
        int sayi ;
        int sayac =0;
        int toplam = 0;

        while (sayac <= 5){
            System.out.print("Sayi giriniz: ");
            sayi= input.nextInt();
            if(sayi >=0){
                toplam += sayi;
            }
            sayac++;
        }
        System.out.println(toplam);
    }
}
