package Gun45._02_ExeptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        for (int i = 0; i < 3; i++) {
            Scanner oku = new Scanner(System.in);
            try { // Hata cikma olaslilikli yeri try{} ini aldik

                System.out.println("Sayi1: ");
                int sayi1 = oku.nextInt();

                System.out.println("Sayi2: ");
                int sayi2 = oku.nextInt();

                System.out.println("Bolum: " + (sayi1 / sayi2));
            } catch (InputMismatchException ex) { // bu tipten hata olursa (sayi yerine yazi yazarsan erki)
                System.out.println("Lutfen sayi giriniz..");
                i--;
            } catch (ArithmeticException ex) { // tipten hata olursa (5/0 gibi ya 0/0)
                System.out.println("Sifira bolme hatasi..");
                i--;
            }
            catch (Exception ex) { // Genel hata olursa, ukaridakilerin disinda
                System.out.println("Lutfden tekrar deneyiniz..");
                i--;
            }
        }
        System.out.println("Program Bitti");
    }
}
