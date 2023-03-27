package Gun46_Hafta_11._02_ThrowExapmple;

import java.util.Scanner;

public class OLMASI_GEREKEN_ThrowExapmple {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni sifre olusturma ");

        System.out.println("yeni sifremizi olsuturunuz");
        String password = oku.nextLine();

        try {
            if (password.length() < 8)
                System.out.println("Lutfen dikkat !");
            System.out.println("Sifre 8 karaterden kucuk");

            if (password.length() > 15)
                System.out.println("Lutfen dikkat ! ");
            System.out.println("Sifre 15 karakterden buyuk");

        } catch (Exception ex) {
            // Hatalar bir yere toplanip, hepsi icin yapilmasi gereken islemler
            // birarada burada yapilabilir. mesela lig tutma gibi.
            System.out.println("Lutfen Dikkat ! ");
            System.out.println("Uyari: " + ex.getMessage());
            // log tutma
        }
    }
}
