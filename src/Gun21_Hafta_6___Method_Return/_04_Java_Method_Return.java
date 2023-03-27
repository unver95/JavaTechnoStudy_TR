package Gun21_Hafta_6___Method_Return;

import java.util.Scanner;

public class _04_Java_Method_Return {
    public static void main(String[] args) {
        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.
// int carpim =1;
// for(int i=1; i <=sayi; i++)  // 1 * 2 * 3 * 4 * 5
// carpim *= i;


        Scanner input = new Scanner(System.in);
        int s1 = input.nextInt();
        int son = Faktoriyel(s1);
        System.out.println("son = " + son);

        System.out.println(son % 2 == 0 ? "cift" : "tek");
    }

    public static int Faktoriyel(int sayi1) {
        int sonuc = 1;
        for (int i = 1; i <= sayi1; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
