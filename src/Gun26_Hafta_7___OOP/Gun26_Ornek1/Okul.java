package Gun26_Hafta_7___OOP.Gun26_Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        Scanner input = new Scanner(System.in);

        ArrayList<Ogrenci> liste = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogrenciBilgileri = new Ogrenci();
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
