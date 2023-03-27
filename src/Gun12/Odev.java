package Gun12;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /*
        1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız

        2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        */


        /*                      Soru 1                     */
        Scanner input = new Scanner(System.in);
        int ayNumb;

        System.out.print("1-) Bir sayi girin: ");
        ayNumb = input.nextInt();

        switch (ayNumb) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number.");
        }

        /*                      Soru 2                     */

        int sayi;
        System.out.println("2-) Sayi yaz");
        sayi = input.nextInt();

        switch (sayi / 100) {
            case 1:
                System.out.println("Yuz");
                break;
            case 2:
                System.out.println("Ikiyuz");
                break;
            case 3:
                System.out.println("ucuz");
                break;
            case 4:
                System.out.println("dortyuz");
                break;
            case 5:
                System.out.println("besyuz");
                break;
            case 6:
                System.out.println("altiyuz");
                break;
            case 7:
                System.out.println("yediyuz");
                break;
            case 8:
                System.out.println("sekizyuz");
                break;
            case 9:
                System.out.println("dokuyuz");
                break;
            default: {
                System.out.println("Yanlis girdin");
            }
        }
        switch ((sayi / 10) % 10) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("On");
                break;
            case 2:
                System.out.println("Yirmi");
                break;
            case 3:
                System.out.println("Otuz");
                break;
            case 4:
                System.out.println("Kirk");
                break;
            case 5:
                System.out.println("Eli");
                break;
            case 6:
                System.out.println("Altmis");
                break;
            case 7:
                System.out.println("Yetmis");
                break;
            case 8:
                System.out.println("Seksen");
                break;
            case 9:
                System.out.println("Doksan");
                break;
        }
        switch (sayi%10){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
        }

        /*                    3.Odev                         */
        int min =20;
        int max = 80;
        int belirli_Aralikta_UretilenSayi;

        belirli_Aralikta_UretilenSayi =
                (int)(Math.random() * (max-min)) + min;
        System.out.println("20 - 80 arasinda tahmin girin: ");
        belirli_Aralikta_UretilenSayi =input.nextInt();
        switch ((belirli_Aralikta_UretilenSayi%10)){
            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
        }
    }
}

