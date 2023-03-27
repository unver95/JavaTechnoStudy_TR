package Gun20;

import java.util.Arrays;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // 20 elemanli bir dizinin elemanlarini 100 e kadar random sayilar ile doldurunuz
        // bir fonkisyonda doldurunuz ve ayni fonksiyonda yazdiriniz.


        r20ElemanliDizi();

    }

    public static void r20ElemanliDizi() {

        int[] numb = new int[20];


        for (int i = 0; i < numb.length; i++) {
        numb[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(numb));
    }
}
