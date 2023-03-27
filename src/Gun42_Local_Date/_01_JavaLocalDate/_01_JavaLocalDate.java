package Gun42_Local_Date._01_JavaLocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece Gun, Ay, Yil bilgisi tutar

        LocalDate tarih = LocalDate.now();

        System.out.println("tarih: " + tarih);
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // Kendisindeki default var olan formatlar
        System.out.println("\n****** Kendisindeki default var olan formatlar ******\n");
        System.out.println("ISO_DATE:" + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Short: " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("Medium: " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Long: " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full: " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // Localde aldigim tarihi istedigim ulkenin formatina gore, diline gore nasil gosteririm?
        // oregin localdeki saati Almanya ya nasil gosteririz.

        System.out.println("\n************************************************");

        System.out.println("FULL locale.GERMANY: " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        // en - US : Birincisi DILI, ikincisi Ulkeyi temsil ediyor, US United States of America
        // en - UK :                                                UK United Kingdom
        // fr - CA : Kanada Fransizca
        // en - CA : Kanada Ingilizce

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for (Locale l : kullanilabilirLokaller){

            if (l.getDisplayCountry().toLowerCase().contains("au"))
                System.out.println("Dil: " + l.getDisplayLanguage() + " Ulke : " + l.getDisplayCountry() +
                " " + l.getLanguage() + " " + l.getCountry());
        }

        Locale lokalCince = new Locale("en", "AU");

        System.out.println("FULL local australia: " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        /*******************************************************************************************************/

        System.out.println("\n***********************ISTEDIGIM FORMAT*************************");
        //Istedigin formatta goster.
        System.out.println("Tarih: " + tarih);

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Tarih: dd/MM/yyyy: " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Tarih: dd.MM.yyyy: " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3 = DateTimeFormatter.ofPattern("EEE dd.MM.yyyy");
        System.out.println("Tarih: EEE dd.MM.yyyy: " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4 = DateTimeFormatter.ofPattern("EE dd/MM/yyy");
        System.out.println("Tarih: EE dd/MM/yyyy: " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5 = DateTimeFormatter.ofPattern("MMM dd.MM.yyy");
        System.out.println("Tarih: MMM dd.MM.yyyy: " + tarih.format(ozelFormat5));

        System.out.println("Ozel Format ve Dil: " + tarih.format(ozelFormat5.withLocale(Locale.US)));


        System.out.println("\n************************************************");
        // Kendimiz bir tarihi nasil set edebiliriz, olusturabiliriz, int sat=5 gibi

        LocalDate tarih1 = LocalDate.of(2020, 6, 1);
        LocalDate tarih2 = LocalDate.of(2021, Month.APRIL, 4);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat1));
    }
}
