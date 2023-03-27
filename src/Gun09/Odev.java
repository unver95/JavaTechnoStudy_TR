/*
1- Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.

2- Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.

3- Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.

4- Girilen bir kelimede A harfinin olup olmadığını yazdırınız.

5- Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.

6- Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.
*/

package Gun09;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        /********************** 1.Soru *****************/

        Scanner inputInt = new Scanner(System.in);
        int numb;

        System.out.print("Bir sayi giriniz: ");
        numb = inputInt.nextInt();

        int onlar = (numb/10)%10;
        if(onlar%2 == 0){
            System.out.println("Ciftir");
        }
        if(onlar%2 != 0){
            System.out.println("Tektir");
        }
        /********************** 2.Soru *****************/

        Scanner inputString = new Scanner(System.in);
        String sifre = "Bayrak";
        String gSifre;

        System.out.println("Sifrenizi giriniz");
        gSifre = inputString.nextLine();

        if(sifre.equals(gSifre)){
            System.out.println("Giris basarli");
        }
        if(!sifre.equals(gSifre)){
            System.out.println("Hesabiniz bloklandi");
        }
        /********************** 3.Soru *****************/

        String kelime;

        System.out.println("Kelime gir: ");
        kelime = inputString.next();

        char ilkHarf = kelime.charAt(0);
        char sonHarf = kelime.charAt(kelime.length()-1);
        if(ilkHarf == sonHarf){
            System.out.println("Girdiginiz ilk ve son harf ayni");
        }
        if(ilkHarf!=sonHarf){
            System.out.println("Girdiginiz ilk ve son herf ayni degil");
        }

        /********************** 4.Soru *****************/

        String ilkKelime;

        System.out.println("Kelime gir");
        ilkKelime = inputString.next();

        if(kelime.contains("A")){
            System.out.println("A var");
        }
        if(!kelime.contains("A")){
            System.out.println("A yok");
        }
        /********************** 5.Soru *****************/

        Scanner scr = new Scanner(System.in);
        String kel1,kel2;
        System.out.print("Kelime gir: ");
        kel1 = scr.nextLine();

        System.out.print("Kelime gir: ");
        kel2 = scr.nextLine();

        if(kel1.length() == kel2.length()){
            System.out.println("Girilen kelimler ayni uzunlukta");
        }
        if(kel1.length() != kel2.length()){
            System.out.println("Girilen kelimler ayni uzunlukta degil");
        }
        /********************** 6.Soru *****************/

        String psw;
        Scanner sfr = new Scanner(System.in);
        System.out.print("8 haneli bir sifre giriniz: ");
        psw = sfr.nextLine();


        if (psw.length()>=8){
            System.out.println("Yeni sifreniz onayladi");
        }
        if (psw.length()<=8){
            System.out.println("Yeni sifreniz kabul edilmedi");
        }
    }
}
