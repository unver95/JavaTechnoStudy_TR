package Gun19___2D_JavaArray;

public class _05_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo = {          // 5 satir 3 sutun -> 5x3
                {4, 55, 66},       // 0.Satir
                {54, 6, 77},       // 1.Satir
                {23, 61, 10},      // 2.Satir
                {66, 37, 69},      // 3.Satir
                {2, 89, 26},       // 4.Satir
        };

        System.out.println("Satir miktari: " + tablo.length);
        System.out.println("0. Satirdaki sutun sayisi: " + tablo[0].length);
        System.out.println("1. Satirdaki sutun sayisi: " + tablo[1].length);
        System.out.println("2. Satirdaki sutun sayisi: " + tablo[2].length);
        System.out.println("3. Satirdaki sutun sayisi: " + tablo[3].length);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");

            }

            System.out.println();
        }
    }
}
