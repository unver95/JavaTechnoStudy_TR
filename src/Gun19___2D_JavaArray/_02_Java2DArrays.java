package Gun19___2D_JavaArray;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi = new int[10];                    // Bos defualt degeri = 0
        int[] dizi2 = {34, 5, 67, 88, 93, 44, 55, 66, 33};   // 10 Elemanli degerkeri bastan ataniyor.

        int[][] tablo = new int[2][3];               // Bos defualt deger = 0
        int[][] tablo1 = {{3, 5, 6}, {56, 7, 88}};     // Her bir satir icin icerde {} acilir
        // {3,5,6} 1. Satir , {56,7,88} 2.Satir
        // 2 SATIR , 3 SUTUN  int [][] tablo1 = int [2][3];


        for (int satir = 0; satir < 2; satir++) {
            System.out.print(tablo1[satir][0]);       // Her satirin ilk elemani 0 index
            System.out.print(" " + tablo1[satir][1]); // Her satirin ikinci elemani 1 index
            System.out.print(" " + tablo1[satir][2]); // Her satirin ucuncu elemani 2 index

            System.out.println();
        }

        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++)
                System.out.print(tablo1[satir][sutun] + "\t");

                System.out.println();

        }
    }
}
