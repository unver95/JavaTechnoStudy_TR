package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Bir sayi giriniz");
        sayi = input.nextInt();

        if(sayi%2==0){
            System.out.println("Sayi cifttir.");
        }else{ // -1  olsa 1 de olsa else e dusecek cunku rakmi 2 ye bolursen ya 1 yada -1 yada  0 cikar ama 0 olursa o yukari da ki olur
            System.out.println("Sayi tek");
        }
    }
}
