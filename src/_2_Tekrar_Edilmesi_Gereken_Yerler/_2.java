package _2_Tekrar_Edilmesi_Gereken_Yerler;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String isim;

        System.out.println("Isim Soyisim gir: ");
        isim = input.nextLine();

        char bHarf = isim.charAt(0);
        int boslukIndex = isim.indexOf(" ");
        char soyadiBasi = isim.charAt(boslukIndex + 1);

        System.out.println(bHarf + "." + soyadiBasi + ".");
    }
}