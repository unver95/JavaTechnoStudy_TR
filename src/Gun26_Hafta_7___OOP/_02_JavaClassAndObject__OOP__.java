package Gun26_Hafta_7___OOP;

import java.util.Scanner;

public class _02_JavaClassAndObject__OOP__ {

        //metodlarin yazilabildigi yer
    public static void main(String[] args) {
        //programin basladigi yer, ilk bu noktadan sonra caismaya baslar
        int sayi = 5;
        Scanner oku = new Scanner(System.in);

        Araba benimArabam = new Araba();        // Araba: TIPI,benimArabam: degisken adi.

        benimArabam.modelYili = 2014;
        benimArabam.renk = "Siyah";
        benimArabam.motorHacmi = 1500.21;
        benimArabam.plaka = "07 asd 1232";

        System.out.println("benimArabam.plaka = " + benimArabam.plaka);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.modelYili = " + benimArabam.modelYili);

    }

    //Metotlarin yazildigi yer
}

// Normalde baska sayfaya yazilmasi gerek ama biz buraya yazdik

class Araba { // bu bolume class diyoruz bu bizim bize ozgu tipimiz.

    int modelYili;
    String renk;
    double motorHacmi;
    String plaka;
}
