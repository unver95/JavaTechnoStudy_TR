package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMetod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
        Scanner input = new Scanner(System.in);
        int sayi;

        int[] sayiDizlieri = new int[5];
        for (int i = 0; i < sayiDizlieri.length; i++) {
            System.out.print("Sayi girin: ");
            sayi = input.nextInt();
            sayiDizlieri[i] = sayi;
        }
        diziEnbuyuk(sayiDizlieri);
        diziEnKucuk(sayiDizlieri);
        diziOrtalama(sayiDizlieri);

        System.out.println(Arrays.toString(sayiDizlieri));
    }

    public static void diziEnbuyuk(int []dizi) {
        int enBuyuk = 0;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] >enBuyuk){
                enBuyuk =dizi[i];
            }
        }
        System.out.println("En buyuk sayi: " + enBuyuk);
    }
    public static void diziEnKucuk(int [] dizi){
        int enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] < enKucuk){
                enKucuk = dizi[i];
            }
        }
        System.out.println("En kucuk sayi: " + enKucuk);
    }
    public static void diziOrtalama(int []dizi){
        int toplam = 0;
        int ort;

        for(int i =0; i < dizi.length; i++){
            toplam+=dizi[i];
        }
        ort=toplam/dizi.length;
        System.out.println("Ortalama: " + ort);
    }
}