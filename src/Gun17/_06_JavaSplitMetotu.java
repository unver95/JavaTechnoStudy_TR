package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaSplitMetotu {
    public static void main(String[] args) {
        //Kullanıcın gireceği 02/11/2022 şeklindeki tarih bilgisini
        // gün ay yıl olarak yazdırınız.

        Scanner input = new Scanner(System.in);
        String cumle;

        System.out.print("Tarih girin: ");
        cumle =input.nextLine();

        String [] kelimeler = cumle.split("/");

        for(int i = 0; i < kelimeler.length; i++){
            System.out.println("kelimeler= " + kelimeler[i]);
        }
    }
}