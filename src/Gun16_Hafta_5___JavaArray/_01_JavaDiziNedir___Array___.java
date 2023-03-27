package Gun16_Hafta_5___JavaArray;

import java.util.Scanner;

public class _01_JavaDiziNedir___Array___ {
    public static void main(String[] args) {

        int ogrNot; // 1 tane sayi sakliyabilir.

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        int ogrNot4;
        //...
        int ogrNot100;

        // Bana bir tanimlamada BIRDEN FAZLA deger tutabilecek bir DEGISKENE ihtiyacim var

        // COZUM:

        int not = 0;
        int[] notlar = new int[2]; // 250 tane not tutabilen INT tipinde degisken

        notlar[0] = 60; // 0. kutudaki deger 60
        notlar[1] = 70; // 1. kutudaki deger 70
        //...
        //...
        //notlar[2] = 80; // 250. kutu deger 80

        System.out.println("notlar[0]" + notlar[0]);

        Scanner oku = new Scanner(System.in);

        for(int i = 0; i < notlar.length; i++){
            System.out.print("Not giriniz: ");
            notlar[i] = oku.nextInt();
        }
        for(int i =0; i < notlar.length; i++){
            System.out.println(i);
        }

    }
}
