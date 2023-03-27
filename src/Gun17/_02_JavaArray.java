package Gun17;

import java.util.Random;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] sayi = new int[100];
        Random r = new Random();
        int makineTutugu;
        int enBuyuk = 0;
        int enBuyukIndex = 0;


        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = (int) (Math.random() * 100);
        }

        //Yazmasak da olur
        for(int i = 0 ; i< sayi.length; i++ ){
            System.out.println(i + "Kutu: " + sayi[i]);
        }

        for (int i = 0; i < sayi.length; i++){
            if(sayi[i]>enBuyuk) {
                enBuyuk = sayi[i];
                enBuyukIndex = i;
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enBuyukIndex = " + enBuyukIndex);
    }
}
