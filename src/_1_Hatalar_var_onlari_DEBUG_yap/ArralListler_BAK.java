package _1_Hatalar_var_onlari_DEBUG_yap;

import java.util.ArrayList;
import java.util.Scanner;

public class ArralListler_BAK {
    public static void main(String[] args) {
        ArrayList<Integer> sinifNotlari = notlar();
        ortlama(sinifNotlari);


    }

    public static ArrayList<Integer> notlar() {
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        String cevap;
        int sayi;
        int toplam = 0;
        int ort = 0;
        do {
            System.out.print("Ogrenci notu gir: ");
            sayi = input.nextInt();
            toplam += sayi;
            notlar().add(sayi);

            System.out.print("Bir tane daha sayi girecen mi: ");
            cevap = sInput.nextLine();
        } while (cevap.equalsIgnoreCase("E"));
        return notlar();
    }

    public static int ortlama (ArrayList<Integer>notCagirma ){
        int toplam = 0;
        int ort ;
        int gecenKisi =0;

        for (int i = 0; i < notCagirma.size(); i++) {
            toplam += notCagirma.get(i);
        }
        ort =toplam / notCagirma.size();

        for (int i = 0; i < notCagirma.size(); i++) {
            if(notCagirma.get(i)>ort){
                gecenKisi++;
            }
        }
        System.out.println("Gecen sayisi: " + gecenKisi);
        return  ort;
    }
}

