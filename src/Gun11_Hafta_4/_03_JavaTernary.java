package Gun11_Hafta_4;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // kullanicinn girecegi sayinin tek mi cift mi oldgunu yazdiriniz

        Scanner oku = new Scanner(System.in);
        int sayi;

        System.out.print("sayi gir: ");
        sayi = oku.nextInt();

        // 1. Yontem
//        if (sayi % 2 ==0){
//            System.out.println("cift");
//        }else {
//            System.out.println("tek");
//        }

        // 2. Tek yontem saturda yazma yontemi : Ternary
        // sadece if else icin yapilmasi gerek fazla varsa gerek yok bunu yapmaya.
        String sonuc =(sayi % 2 ==0) ? "cift" : "tek"; // sart dogru ise ilk bolum degilse ikinci bolurm
                                  // ? If,    : else anlamina geliyor
        System.out.println(sonuc);
    }
}
