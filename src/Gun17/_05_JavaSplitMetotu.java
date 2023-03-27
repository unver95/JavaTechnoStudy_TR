package Gun17;

import java.util.Arrays;

public class _05_JavaSplitMetotu {
    public static void main(String[] args) {
        // split: bir stringi parcalara ayiriyor, verilen kritere gore.

        String cumle = "Bugun hava oldukca soguk"; // bunu kelimelerine ayirmak isyiyruz.
        //Bugun
        //hava
        //oldukca
        //soguk
        String[] kelimeler = cumle.split(" ");

        //uzun yol. (Bir sey vermese karaterlerine ayiyir)
        for(int i = 0; i <kelimeler.length; i++){
            System.out.println(i+ "kelime= " + kelimeler[i]);
        }

        //kisa yol
        System.out.println("Kelimeler: " + Arrays.toString(kelimeler));

    }
}
