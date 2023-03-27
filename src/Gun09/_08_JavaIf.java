package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //Girilen 3 sayi dan en buyuk olani bul

        Scanner input = new Scanner(System.in);
        int numb1, numb2, numb3;

        System.out.println("Sayi girin");
        numb1 = input.nextInt();

        System.out.println("Sayi girin");
        numb2 = input.nextInt();

        System.out.println("Sayi girin");
        numb3 = input.nextInt();

        int enBuyuk = numb1;

        if (numb2 > enBuyuk){
            enBuyuk = numb2;
        }
        if (numb3 > enBuyuk){
            enBuyuk = numb3;
        }
        System.out.println("Girdiginiz en buyuk rakam:" + enBuyuk);
    }
}
