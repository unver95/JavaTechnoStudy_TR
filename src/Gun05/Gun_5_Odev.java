package Gun05;

import java.util.Scanner;

public class Gun_5_Odev {
    public static void main(String[] args) {

        Scanner stringInput = new Scanner(System.in);
        Scanner sayiInput = new Scanner(System.in);

        String isim;

        System.out.print("Adinizi yazdiriniz: ");
        isim = stringInput.nextLine();

        System.out.println("Adiniz " + isim);
/***********************************************************/


        int i;

        System.out.print("Sayi giriniz: ");
        i = sayiInput.nextInt();

        System.out.println("Girdiginiz sayi: " + i);

/***********************************************************/


        String meyve;

        System.out.print("En sevdigin meyveyi yaziniz: ");
        meyve = stringInput.nextLine();

        System.out.println("En sevdiginiz meyve " + meyve + " dir");

/***********************************************************/


        int kapi;

        System.out.print("Arabada ki kapi sayisini giriniz: ");
        kapi = sayiInput.nextInt();
        System.out.println("Arabada toplamda " + kapi + " kapi var");


/***********************************************************/


        String sehir;

        System.out.print("10 sene once hangi sehirde yasiyordun: ");
        sehir = stringInput.nextLine();

        System.out.println("Yasadiginiz sehir " + sehir);

/***********************************************************/


        String dogumGunu;

        System.out.print("Dogum gunun ne zaman: ");
        dogumGunu = stringInput.nextLine();

        System.out.println("Dogum gununuz " + dogumGunu);

/***********************************************************/


        Boolean bankaHesabinVarMi;
        System.out.print("Banka hesabiniz var mi ? Var ise \"true\" yok ise \"false\" ");
        bankaHesabinVarMi = stringInput.nextBoolean();

        if (bankaHesabinVarMi == true) {
            System.out.println("Banka hesabiniz var! " + bankaHesabinVarMi);
        } else {
            System.out.println("Banka hesabiniz yok! " + bankaHesabinVarMi);
        }

/***********************************************************/


        byte b;

        System.out.println("KG giriniz: ");
        b = sayiInput.nextByte();

        System.out.println("KG = " + b);

/***********************************************************/


        float boy;

        System.out.println("Boyunuzu giriniz cm olarak: ");
        boy = sayiInput.nextFloat();

        System.out.println(boy + " cm siniz");
    }
}