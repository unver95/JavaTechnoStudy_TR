package Gun05;
// ctrl + alt + l yazilari otomatik duzeltir
import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        int         sayi        =5;
        //tipi      adi         degeri ; islem tamam

        Scanner   okuyucu =   new Scanner      (System.in); // int i == Scanner okuyucu.
                                                            // new Scanner ayni int i = 5. 5 deki gbi yeni bir sey almaya hazir System.in oldugu icin bunu konsoldan alacak
        //tipi    adi         yeni bir okuyucu (Klayeden - konsoldan)

        System.out.println("Sayi giriniz");
        sayi = okuyucu.nextInt();
        //okuyucu.nextInt() -> ekrandan 1 tam sayi (int cinsinden) oku.

        System.out.println("sayi = "+sayi);
    }
}
