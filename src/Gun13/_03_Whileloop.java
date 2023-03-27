package Gun13;

import java.util.Scanner;

public class _03_Whileloop {
    public static void main(String[] args) {
        //Girilen 20 sayinin toplamini sonuca yazdrininiz;

        Scanner input = new Scanner(System.in);
        int sayi;
        int sayac = 1;
        int toplam = 0;

        while (sayac <= 20) {
            System.out.print(sayac + ". Sayi giriniz: ");
            sayi = input.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("Toplam: " + toplam);
    }
}
