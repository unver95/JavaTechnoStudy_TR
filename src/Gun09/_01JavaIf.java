package Gun09;

import java.util.Scanner;

public class _01JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayi 10 dan buyuk ise ekrana 10 dan buyuk yazdiriniz

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Bir sayi gir");
        sayi = input.nextInt();

        if (sayi > 10) { // Sart dogru ise bu parantes ici calisacak
            System.out.println("Girdigin sayi 10 dan buyuktur");
        }
    }
}
