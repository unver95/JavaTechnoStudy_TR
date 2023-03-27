package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir sayinin tek olup olmadigini bulunuz.

        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.println("Sayi girin: ");
        sayi = input.nextInt();

        System.out.println(sayi%2 ==1);
        /*
            5  tek mi   5 % 2  =>  1  se tektir
            4  tek mi   4 % 2  =>  0 se tek değildir
        */

    }
}
