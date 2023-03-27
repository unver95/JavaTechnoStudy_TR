package Gun43_JavaLocalDateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

public class _02_Period {
    public static void main(String[] args) {
        //2 tarih arasindaki zaman farkini gosterir
        //LocalDate ler icin kullanilir

        LocalDate dogumTarihi = LocalDate.of(1997,10,02);
        LocalDate buGun=LocalDate.now();

        Period fark = Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" yasindasin");

        /**********************************************/

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);
        Period period3Yil = Period.ofYears(3);

        LocalDate ucGunSonra = buGun.plus(period3Gun); //zaman araligi ekleme
        LocalDate ucAySonra = buGun.plus(period3Ay);
        LocalDate ucYilSonra = buGun.plus(period3Yil);

        System.out.println("ucAySonra = " + ucAySonra);
        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucYilSonra = " + ucYilSonra);



        /**********************************************/
        // Ornek Kursun suresini ve bitis gunu bulunuz (6 ay)
        // ne kadar sure kaldi.

        LocalDate kursBaslangic = LocalDate.of(2022, 7,25);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);

        System.out.println("KursBitis: " + kursBitis);
        System.out.println("Kurs Bitis Gunu: " + kursBitis.getDayOfWeek());

        // Kursun bitmesinine ne kadar sure kaldi.
        Period neKadarSureKaldi = Period.between(buGun, kursBitis);
        System.out.println("Ne kadar sure kaldi: " + neKadarSureKaldi);

        //Kurs ne kadar suredur devam ediyor
        Period devamSuresi = Period.between(kursBaslangic, buGun);
        System.out.println("devamSuresi = " + devamSuresi);

    }
}
