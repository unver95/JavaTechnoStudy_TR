package _2_Tekrar_Edilmesi_Gereken_Yerler;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();

        System.out.println("saat: " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        //kendimizin ozel format
        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat.format(of1): " + saat.format(of1));

        DateTimeFormatter of2 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat.format(of2): " + saat.format(of2));

        DateTimeFormatter of3 = DateTimeFormatter.ofPattern("k:mm");
        System.out.println("saat.format(of3): " + saat.format(of3));
    }
}
