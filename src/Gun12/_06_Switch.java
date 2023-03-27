package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz.

        Scanner input = new Scanner(System.in);
        int sayi, onlar;

        System.out.print("Sayi giri: ");
        sayi = input.nextInt();

        onlar = (sayi / 10) % 10;
        switch (onlar){
            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
        }
    }
}