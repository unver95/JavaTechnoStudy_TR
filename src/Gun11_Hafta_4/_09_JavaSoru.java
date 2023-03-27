package Gun11_Hafta_4;

import java.util.Scanner;

public class _09_JavaSoru {
    public static void main(String[] args) {
        // Girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz.
        // kullanici bilirse tebrik yazdiriniz.
        Scanner input = new Scanner(System.in);
        int sinir,tutulanSayi;

        System.out.println("uretilecek sayi siniri= ");
        sinir = input.nextInt();

        tutulanSayi= (int)(Math.random()*(sinir+1));
        ;
        // Math.ran -> 0.0 - 0.99999
        // (5+1) ile carparsan -> 0.0 - 5.9999
        // (int) ile casting yaptginizda 0-5 olur
        System.out.print("Tahmininiz: ");
        int tahmin = input.nextInt();

//        if(tutulanSayi == tahmin){
//            System.out.println("Tebrikler bildiniz");
//        }else {
//            System.out.println("Bilemediniz");
//        }
        System.out.println((tutulanSayi == tahmin) ? "Tebrikler bildiniz " : "Bilemediniz");

        System.out.println("tutulanSayi = " + tutulanSayi);

    }
}
