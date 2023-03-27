package Gun21_Hafta_6___Method_Return;

import java.util.Scanner;

public class _03_Java_Method_Return {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayi: ");
        int s1 = oku.nextInt();
        System.out.print("2.Sayi: ");
        int s2 = oku.nextInt();

        System.out.println(enBuyukBulma(s1,s2));

    }

    public static int enBuyukBulma(int sayi1, int sayi2){
        int donecek = 0; //enBuyuk

        donecek = sayi1 > sayi2 ? sayi1 : sayi2;

            return donecek;
    }
}
