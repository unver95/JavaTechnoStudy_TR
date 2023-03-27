package Gun08;

import java.util.Scanner;

/*
1-Girilen bir cümlenin ilk ve son harfini bulunuz
2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız
3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz
4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.
5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567
6-Girilen bir cümledeki son kelimeyi bulunuz
*/
public class Odev_1 {
    public static void main(String[] args) {

        /********************** 1.Soru ******************************/
        Scanner input = new Scanner(System.in);
        String cumle;

        System.out.println("Bir cumle gir");
        cumle = input.nextLine();

        char ilkHarf = cumle.charAt(0);
        char sonHarf = cumle.charAt(cumle.length() - 1);
        System.out.println(ilkHarf + " " + sonHarf);

        /********************** 2.Soru ******************************/

        System.out.println("3 kelimelik cumle giriniz");
        cumle = input.nextLine();

        int birinciBosluk = cumle.indexOf(" ");
        String peynir = cumle.substring(0, birinciBosluk);


        int ikinciBosluk = cumle.indexOf(" ", birinciBosluk + 1);
        String kasar = cumle.substring(birinciBosluk + 1, ikinciBosluk);

        String curukPeynir = cumle.substring(ikinciBosluk + 1);

        System.out.println("Birinci kelime: " + peynir);
        System.out.println("Ikinci kelime: " + kasar);
        System.out.println("Ucuncu kelime: " + curukPeynir);

        /********************** 3.Soru ******************************/

        System.out.println("3 tane kelime girin");
        cumle = input.nextLine();

        char ilkKarater = cumle.charAt(0);
        int ilkBosluk = cumle.indexOf(" ");

        char ikinciKarater = cumle.charAt(ilkBosluk + 1);
        int ikinciBosluk1 = cumle.indexOf(" ", ilkBosluk + 1);

        char ucuncuKarater = cumle.charAt(ikinciBosluk1 + 1);

        System.out.println("ilkKarater = " + ilkKarater);
        System.out.println("ikinciKarater = " + ikinciKarater);
        System.out.println("ucuncuKarater = " + ucuncuKarater);

        /********************** 4.Soru ******************************/

        System.out.println("Kelime girin: ");
        cumle = input.nextLine();


        System.out.println(cumle.contains("B"));

        /********************** 5.Soru ******************************/


        System.out.println("Kart numaranizi giriniz: ");
        cumle = input.nextLine();

        int sonBosluk = cumle.lastIndexOf(" ");
        String sonDortlu = cumle.substring(sonBosluk + 1);

        System.out.println("**** **** **** " + sonDortlu);

        /********************** 5.Soru ******************************/

        System.out.println("Cumle giriniz: ");
        cumle = input.nextLine();

        int lastSpace = cumle.lastIndexOf(" ");
        String LastWord = cumle.substring(lastSpace + 1);

        System.out.println(LastWord);

    }
}
