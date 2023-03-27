package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {
        //Girilen bir cumlede ilk kelimeyi yazdir

        Scanner input = new Scanner(System.in);

        String cumle;
        System.out.println("Bir cumle gir");
        cumle = input.nextLine();

        int boslukIndex= cumle.indexOf(" ");
        String ilkKelime = cumle.substring(0, boslukIndex);
        int ikinciBosluk = cumle.indexOf(" ", boslukIndex+1);

        System.out.println("Ilk kelime: " + ilkKelime +" "+ ikinciBosluk);
    }
}
