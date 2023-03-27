package Gun16_Hafta_5___JavaArray;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        // 6 7 3 8 1 -> toplam 25 -> ort = 25/eleman sayisi -> ort dan buyuk kac eleman var


        Scanner input = new Scanner(System.in);
        int[] notlar = new int[5];
        int notlarToplamı = 0;
        int sayac = 0;
        int ortalama;


        for (int i = 0; i < notlar.length; i++) {
            System.out.print("notlar:");
            notlar[i] = input.nextInt();
            notlarToplamı += notlar[i];
        }
        ortalama = notlarToplamı / notlar.length;
        for(int i=0;i<notlar.length;i++){
            if (notlar[i] >=ortalama){
                System.out.println("notlar[i] = " + notlar[i]);
                sayac++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println(sayac+"kisi ortalamayi gecti");
    }
}
