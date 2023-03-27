package Gun18;

import java.util.Arrays;
import java.util.Random;

public class _03_JavaArrays {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // tek elemanlarını ayrı bir diziye, çift elemanlarını ayrı bir başka
        // diziye, sadece atanana elemanların sayısı kadar olacak şekilde atayınız.

        int[] dizi = new int[10];

        int tekMiktar = 0;
        int ciftMiktar = 0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);

            if (dizi[i] % 2 == 0) {
                ciftMiktar++;
            } else {
                tekMiktar++;
            }
        }

        System.out.println("dizi: " + Arrays.toString(dizi));
        int [] tekDizi = new int[tekMiktar];
        int [] ciftDizi = new int[ciftMiktar];

        int cIndex = 0;
        int tIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]%2==0){
                ciftDizi[cIndex] = dizi[i];
                cIndex++; // ciftlerin kutucujkarini takip ediyor
            }else {
                tekDizi[tIndex] = dizi[i];
                tIndex++; // teklerin kutucujkarini takip ediyor
            }
        }
        System.out.println("cift dizi: " + Arrays.toString(ciftDizi));
        System.out.println("tek dizi: " + Arrays.toString(tekDizi));
    }
}
