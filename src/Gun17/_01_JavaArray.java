package Gun17;

import java.util.Random;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız  yazdırınız.
        Random r = new Random();
        int[] sayi = new int[50];
        int makineTutugu;

        for (int i = 0; i < sayi.length; i++) {
            makineTutugu = r.nextInt(0, 10 + 1);
            sayi[i] = makineTutugu;
        }

            for (int i = 0; i < sayi.length; i++) {
                if (sayi[i] % 2 == 1) {
                    sayi[i] = 1;
                } else {
                    sayi[i] = 2;
                }
            }
        for (int i = 0; i < sayi.length; i++)
            System.out.println(i + ".Sayi " + sayi[i]);
    }
}
