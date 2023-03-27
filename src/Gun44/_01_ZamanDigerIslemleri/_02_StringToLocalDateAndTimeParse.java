package Gun44._01_ZamanDigerIslemleri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis(); // kodun performansi icin pratik

        // kullanicidan alinan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih degiskenine cevrilmesi

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2020): ");
        String strTarih;
        strTarih = oku.nextLine();

        //Kullanicinin girecegi formata gore format olusturmak.
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");

        //String formati bu formata uygun olmali. Parse ile cevirdik.
        LocalDate tarih = LocalDate.parse(strTarih, f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));

        Long finihTime = System.currentTimeMillis();


        // kac ms de bitti
        System.out.println("gecenSure MS: " + (finihTime - startTime));
    }
}
