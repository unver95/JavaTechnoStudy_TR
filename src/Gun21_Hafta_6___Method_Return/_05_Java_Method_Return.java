package Gun21_Hafta_6___Method_Return;

import java.util.Scanner;

public class _05_Java_Method_Return {
    //Kullanıcının gireceği 2 sayının toplamını
    //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayi: ");
        int s1 = oku.nextInt();
        System.out.print("2.Sayi: ");
        int s2 = oku.nextInt();

        int toplam = toplamBul(s1, s2); // 2 sayi al, sonucu gonder (return)

        System.out.print("Toplam: " + toplam);

    }

    public static int toplamBul(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}
