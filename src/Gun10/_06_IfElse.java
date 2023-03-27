package Gun10;

import java.util.Locale;
import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner input = new Scanner(System.in);
        String psw;

        System.out.println("Sifre girin: ");
        psw = input.nextLine();

        if (psw.length() >= 8 && !psw.contains("pass") && psw.length() <= 12) {
            System.out.println("Sifreniz basarli ile degistirildi");
        } else {
            System.out.println("Hatta var");
        }

        //2. yontem.

        int uzunluk = psw.length();
        boolean varMi = psw.toLowerCase().contains("pass"); // boolean toLowerCase bakmaz cunku o boolean icermez burda sadece contains e bakiyor

        if (uzunluk >= 8 && uzunluk <= 12 && !varMi) { // varMi= false
            System.out.println("uygun");
        }else {
            System.out.println("degil");
        }
    }
}
