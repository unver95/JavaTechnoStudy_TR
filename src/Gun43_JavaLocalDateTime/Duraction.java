package Gun43_JavaLocalDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duraction {
    public static void main(String[] args) {
        //Duration : hem LocalTime hem de LocalDateTime ın kendi aralarindaki farkı
        //verir yani saat in oldugu her zamanlar arasındaki farkı bu şekilde buluyoruz

        //LocalTime
        LocalTime dersBaslangic = LocalTime.of(8, 30);
        LocalTime dersBitis = LocalTime.of(11, 15);

        Duration GunlukDersSaat = Duration.between(dersBaslangic, dersBitis);
        System.out.println("GunlukDersSaat = " + GunlukDersSaat);

        System.out.println("GunlukDersSaat.toHours() = " + GunlukDersSaat.toHours()); //farkin toplam saat hali
        System.out.println("GunlukDersSaat.toMinutes() = " + GunlukDersSaat.toMinutes()); //farkin toplam dakika hali
        System.out.println("GunlukDersSaat.getSeconds() = " + GunlukDersSaat.getSeconds());
        System.out.println("GunlukDersSaat.toMillis() = " + GunlukDersSaat.toMillis()); //farkin toplam milisaniye hali

        // LocakDateTime  *** 2 Tarih-Saat arasinda ki fark ***

        LocalDateTime from = LocalDateTime.of(2022, 1, 1, 0, 0);
        LocalDateTime to = LocalDateTime.now();

        Duration farkZaman = Duration.between(from, to);

        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());       // Farkin toplam gunu
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());     // Farkin toplam saati
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); // Farkin toplam dakikasi

    }
}