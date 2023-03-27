package Gun22___ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Java_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        int[] dizi = new int[6];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi: ");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        //1.Yontem
        ArrayList<Integer> tekler = new ArrayList<>();
//        for (int i = 0; i < dizi.length; i++) {
//            if (dizi[i]%2 ==1){
//                tekler.add(dizi[i]);
//            }

        // 2 . Yontem
        tekler = tekElemanlarAta(dizi);
        System.out.println("tekler = " + tekler);
    }

    // TODO : ODEV : tek elemanlarini ayri diziye bir menodda yapin.


    public static ArrayList<Integer> tekElemanlarAta(int[] dizi) {
        ArrayList<Integer> tekler = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                tekler.add(dizi[i]);
            }
        }
        return tekler;
    }
}
