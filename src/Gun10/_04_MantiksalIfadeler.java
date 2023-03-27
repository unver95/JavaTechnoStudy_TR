package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantiksal (Lojik) ifadeler.
        // && Ve demek: iki verinin de dogru olmasi lazim.
        // ||  Veya demek: iki verinin birisi dogru olmasi yeter.

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        // hem tek hem pozitif  ->  (sayi%2 == 1) && (sayi > 0)

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Hem tek hem pozetif sayi gir.");
        sayi = input.nextInt();

        if (sayi % 2 == 1 && sayi > 0) { // Hem tek hem pozetif
            System.out.println("Uygun sayi girildi.");
        } else {
            System.out.println("Uygun sayi GIRILMEDI");
        }


    }
}
