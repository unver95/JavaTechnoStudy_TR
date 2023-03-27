package Gun46_Hafta_11._02_ThrowExapmple;

import java.util.Scanner;

public class ThrowExapmple {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni sifre olusturma ");

        System.out.println("yeni sifremizi olsuturunuz");
        String password = oku.nextLine();

        if (password.length() < 8) {
            System.out.println("Lutfen dikkat !");
            System.out.println("Sifre 8 karaterden kucuk");
            // log tutma
        }

        if (password.length() > 15) {
            System.out.println("Lutfen dikkat ! ");
            System.out.println("Sifre 15 karakterden buyuk");
            // log tutma
        }
    }
}
