package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arasi gibi urettik, hep sifirdan basladi
        // 4-9 arasi uretsin nasil derdim, nasil yapardim
        // once aralik kadar urettirip, sonra ona min kimi eklesem
        // 49 icin: once 0-5 uret: sonra cikan sayiya 4 ekle

        Scanner input = new Scanner(System.in);
        int min,max, belirli_Aralikta_UretilenSayi;

        System.out.print("Min: ");
        min = input.nextInt();

        System.out.println("Max");
        max = input.nextInt();

        belirli_Aralikta_UretilenSayi =
                (int)(Math.random() * (max-min)) + min;

        System.out.println("belirli_Aralikta_UretilenSayi = " + belirli_Aralikta_UretilenSayi);
    }
}
