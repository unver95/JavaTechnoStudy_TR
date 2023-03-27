package Gun11_Hafta_4;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("sayi gir: ");
        sayi1 = input.nextInt();

        System.out.print("sayi gir: ");
        sayi2 = input.nextInt();

        System.out.print("sayi gir: ");
        sayi3 = input.nextInt();


        // 1. yontem
        int enb = Math.max(sayi1,sayi2);
        enb = Math.max(enb, sayi3);

        // 2. yontem

        int enBuyuk = Math.max(sayi1, Math.max(sayi2,sayi3));
        System.out.println(enBuyuk);

        // 3. Yontem
        System.out.println(Math.max(sayi1,Math.max(sayi2, sayi3)));

    }
}
