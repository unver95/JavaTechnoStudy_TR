package Gun14;

import java.util.Scanner;

public class _06_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;


        for (int i = 1; i <= 5; i++) {

            System.out.print("sayi girin: ");
            sayi = input.nextInt();
            if (sayi >= 6 && sayi <= 10) {
                continue;
            }
            toplam += sayi;
        }
        System.out.println(toplam);
    }
}
