package Gun09;

import java.util.Scanner;

// TODO

public class _05_JavaIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Sayi yaz: ");
        sayi = input.nextInt();
        int birlerBasamak = sayi%10;

        if(birlerBasamak == 0){
            System.out.println("sifir");
        }
        if(birlerBasamak == 1){
            System.out.println("bir");
        }
        if(birlerBasamak == 2){
            System.out.println("iki");
        }
        if(birlerBasamak == 3){
            System.out.println("uc");
        }
        if(birlerBasamak == 4){
            System.out.println("Dort");
        }
        if(birlerBasamak == 5){
            System.out.println("Bes");
        }
    }
}
