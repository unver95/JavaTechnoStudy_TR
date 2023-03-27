package Gun21_Hafta_6___Method_Return;

import java.util.Scanner;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.sayi: ");
        int s1 = oku.nextInt();
        System.out.print("2.Sayi: ");
        int s2 = oku.nextInt();

        System.out.println(enBuyukBulma(s1, s2));

    }

    public static int enBuyukBulma(int sayi1, int sayi2) {

        if (sayi1>sayi2){
            return sayi1;
        }else{
            return sayi2;
        }
    }
}

