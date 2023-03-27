package _05_IQ_Sorulari;

import java.util.Arrays;

public class En_Buyuk_Ikinci_Rakami_Bulma {
    public static void main(String[] args) {

/*                              1.yol
        // a=2  b=100 c=10
        Scanner input = new Scanner(System.in);
        int[] sayi = new int[4];

        for (int i = 0; i < sayi.length; i++) {
            System.out.println("4 Tane sayi gir: ");
            sayi[i] = input.nextInt();
        }

        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));
        System.out.println(sayi[sayi.length - 2]);

*/
        /* V1.1
         //int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.


        int [] sayilar = {15 , 25, 22, 18, 30};

        Arrays.sort(sayilar);
        System.out.println(sayilar[sayilar.length-2]);
    }
}
        */



//                                 2.yol
        int gecici;
        int[] dizi = {100, 4, 12, 7, 30, 8, 3, 5, 6, 69};


        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                gecici = dizi[i];
                if (gecici < dizi[j]) {
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        System.out.println("Dizinin tamami: " + Arrays.toString(dizi));
        int[] enBuyukIkinciSayi = new int[dizi.length - 1];

        for (int i = 0; i < enBuyukIkinciSayi.length; i++) {
            enBuyukIkinciSayi[i] = dizi[i+1];

        }
        System.out.println("\t            "+Arrays.toString(enBuyukIkinciSayi));
    }
}
