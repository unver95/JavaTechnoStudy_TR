package Gun11_Hafta_4;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen pozetif, negatif veya sifir oldugunu yazdirin
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Sayi girin");
        sayi = input.nextInt();

        /*******************Olmasi gereken*************************/

//        if (sayi > 0) {
//            System.out.println("sayi pozetif");
//        } else if (sayi < 0) {
//            System.out.println("sayo negatif");
//        } else {
//            System.out.println("essitir");
//        }

        /*******************Hocanin yaptigi*************************/

        if (sayi == 0) {
            System.out.println("sifir");
        } else { //sifir degilse burdan devam et
            if (sayi < 0) {
                System.out.println("Negatif");
            } else {
                System.out.println("pozetif");
            }
        }

    }
}
