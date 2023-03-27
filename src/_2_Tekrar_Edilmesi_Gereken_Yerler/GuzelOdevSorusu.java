package _2_Tekrar_Edilmesi_Gereken_Yerler;/*
addDigits isminde bir method oluşturun.

Parametresi int

Return tipi de int

Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.

Tek basamaklı çıktığında, döndürün
*/
import java.util.Scanner;

public class GuzelOdevSorusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi yazin");
        int numb = input.nextInt();

        int sayac = 1;
// TODO DAHA SONRA BAK GUZEL SORU
        while (numb > 9) {
            numb = basamakTopla(numb);
            System.out.println(sayac + ". toplam = " + numb);
            sayac++;
        }

        System.out.println("Yazdiginiz sayinin basamaklarin toplami = " + numb);
    }
    public static int basamakTopla(int sayi) {
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
    }
}







