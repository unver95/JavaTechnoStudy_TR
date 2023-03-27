package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Array.toString(dizi)
        String[] isimler = {"ahmet" + "melike" + "sumeyra" + "inanc" + "mert"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        //["ahmet" + "melike" + "sumeyra" + "inanc" + "mert"]

        //Arrays.sort(isimler)
        Arrays.sort(isimler); // siralama islemi yapildi
        System.out.println("isimler" + Arrays.toString(isimler));
        // [ahmet, inanc, melike, mert, sumeyra]

        // Diziler esitmi ? Arrays.equals(dizi1, dizi2)
        int[] a = {1,8,3,54};
        int[] b = {1,8,3,54};
        int[] c = {1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // True
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // False

        //Arrays.fill -> butun kutucklara 7 atar;
        Arrays.fill(c,7);
        System.out.println("Arrays.toString(c)) = " + Arrays.toString(c));

        // Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // Aranan elaman birden fazla ise herhangi birini verebilir.
        // Esas amacı var mı yok mu kontrolü, var ise INDEXini verir, yok ise negatif sayı döndürür
        int[] rakamlar = {2,7,4,6,5};
        System.out.println(Arrays.toString(rakamlar));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.toString(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(rakamlar,7) = " + Arrays.binarySearch(rakamlar,7));



    }
}
