package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("ogrenci notu gir: ");
        sayi = input.nextInt();

        if(sayi >= 50){
            System.out.println("Ogrenci gecti.");
        }
        if(sayi < 50){
            System.out.println("Ogrenci cakti.");
        }
    }
}
