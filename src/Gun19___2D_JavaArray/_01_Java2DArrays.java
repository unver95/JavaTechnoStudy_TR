package Gun19___2D_JavaArray;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi = 0;                            // 1 tane sayi tutuyor
        int[] ders1Notlari = new int[40];        // 40 tane sayi saklabilir
        int[] ders2Notlari = new int[40];
        int[] ders3Notlari = new int[40];        // index 0 - 39 a kadar

        int[][] tumDersNotlari = new int[3][40]; //3 ders 40 ogrenci
                                                 //3 ders 40 ogrenci
                                                 //her satir 0-39
                                                 //0,1,2,3 (satir) - 0,2,3,4,5,6 .... 39(Sutun)

        ders1Notlari[0]=80;                      // Tek boyutlu dizide ilk (0) elemana 80 atandi.
        tumDersNotlari[0][0] = 80;               // 2 Boyutlu dizide ilk (0) satirin ilk (0) sutununa 80 atandi

        System.out.println(tumDersNotlari[0][0]);
        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();
    }
}
