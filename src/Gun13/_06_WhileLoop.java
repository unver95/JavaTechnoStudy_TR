package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.
        Scanner in = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;
        int sayi = in.nextInt();;

        while (sayac<=sayi){

            if(sayac%2==1)
                toplam+=sayac;

            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
