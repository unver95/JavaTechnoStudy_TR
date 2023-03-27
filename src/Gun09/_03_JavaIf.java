package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner input = new Scanner(System.in);
        int numb1, numb2;

        System.out.print("Bir sayi giriniz: ");
        numb1 = input.nextInt();

        System.out.print("Bir sayi daha giriniz: ");
        numb2 = input.nextInt();

        if (numb1 > numb2) {
            System.out.println("Giridingiz ilk sayi buyuktur. " + numb1);
        }
        if (numb1 < numb2) {
            System.out.println("Girdiginiz ikinci sayi daha buyuktur: " + numb2);
        }
        if (numb1 == numb2){
            System.out.println("Girdiginiz iki sayi da essittir." + numb1 + "=" + numb2);
        }

    }
}
