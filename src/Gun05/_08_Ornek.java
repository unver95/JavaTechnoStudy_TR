package Gun05;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner input = new Scanner(System.in);
        double agirlik;
        int boy;
        double kitleIdex;

        System.out.println("Agirligini gir: ");
        agirlik = input.nextDouble();

        System.out.println("boy girin: ");
        boy = input.nextInt();

        kitleIdex = agirlik/(boy*boy);
        System.out.println("kitleIdex = " + kitleIdex);
    }
}
