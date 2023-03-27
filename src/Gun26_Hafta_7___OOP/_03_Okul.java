package Gun26_Hafta_7___OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        Scanner input = new Scanner(System.in);

        ArrayList<Ogrenci> liste = new ArrayList<>();  // ----> Ogrenci liste yapiliyor.

        for (int i = 0; i < 3; i++) {
            Ogrenci ogrenciBilgileri = new Ogrenci();  // ----> Surekli yeni ogrenci kayit oluyor.
            System.out.println("Ogrenci adi: ");
            ogrenciBilgileri.ad = input.nextLine();
            System.out.println("Ogrenci soyadi: ");
            ogrenciBilgileri.soyad = input.nextLine();
            System.out.println("Ogrenci adres: ");
            ogrenciBilgileri.adres = input.nextLine();

            liste.add(ogrenciBilgileri);
        }
        for (Ogrenci ogrenciBilgileri : liste) {
            System.out.println("Ogrenci adi: " + ogrenciBilgileri.ad);
            System.out.println("Ogrenci soyadi: " + ogrenciBilgileri.soyad);
            System.out.println("Ogrenci adresi: " + ogrenciBilgileri.adres);
        }
    }
}

class Ogrenci {
    String ad;
    String soyad;
    String sinif;
    String adres;
}