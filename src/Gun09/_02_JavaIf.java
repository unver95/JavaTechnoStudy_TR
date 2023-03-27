package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayinin negatif mi, pozetif mi oldugunu yazdirin
        // Sifir ise sifir yazdirin

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Bir sayi birin");
        sayi= input.nextInt();

        if (sayi>0){
            System.out.println("Sayi sifirdan buyuktur");
        } if (sayi < 0){
            System.out.println("Sayi sifirdan kucuktur");
        }if (sayi == 0){
            System.out.println("Sayi sifira essitir");
        }
    }
}
