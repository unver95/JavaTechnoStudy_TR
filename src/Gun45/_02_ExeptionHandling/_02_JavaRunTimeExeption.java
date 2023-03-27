package Gun45._02_ExeptionHandling;

import java.util.Scanner;

public class _02_JavaRunTimeExeption {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        for (int i = 0; i < 3; i++) {
            Scanner oku = new Scanner(System.in);
            try { // Hata cikma olaslilikli yeri try{} ini aldik

                System.out.println("Sayi: ");
                int sayi1 = oku.nextInt();

                System.out.println("Sayi: ");
                int sayi2 = oku.nextInt();

                System.out.println("Bolum: " + (sayi1 / sayi2));
            } catch (Exception hataBilgileri) { // Hatta mesajlarini hata isimli eception cinsi
                System.out.println("hataBilgileri.getMessage()" + hataBilgileri.getMessage());
                i--;
            }
        }
        System.out.println("Program Bitti");
    }
}
