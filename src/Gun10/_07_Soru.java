package Gun10;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner input = new Scanner(System.in);
        String sayi;

        System.out.print("iki sayi griniz bosluk kullanarak: ");
        sayi = input.nextLine(); // 45 47 once ayir inte cevir somra karsilastir.

        int bosluk = sayi.indexOf(" ");

        String sayi1 = sayi.substring(0, bosluk);
        int numb1 = Integer.parseInt(sayi1);

        String sayi2 = sayi.substring(bosluk + 1);
        int numb2 = Integer.parseInt(sayi2);

        if (numb1 == numb2) {
            System.out.println("Girdiginiz sayilar esittir. ");
        } else {
            System.out.println("esit degildir");
        }
    }
}
