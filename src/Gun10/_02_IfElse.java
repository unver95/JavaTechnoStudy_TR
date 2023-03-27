package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner input = new Scanner(System.in);
        double vize;
        double finalNot;
        double ortalama;


        System.out.print("Ogrenci vize notu giriniz: ");
        vize = input.nextInt();
        vize = vize * 0.4;

        System.out.print("Ogrenci final girin: ");
        finalNot = input.nextInt();
        finalNot = finalNot * 0.6;

        ortalama = vize + finalNot;

        if(ortalama >= 60){
            System.out.println("Gectiniz, ortlamaniz: " + ortalama);
        }else {
            System.out.println("Gecemediniz, ortalamaniz: " + ortalama);
        }
    }
}
