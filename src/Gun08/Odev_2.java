package Gun08;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {
        /********************** 1.Soru ******************************/

        Scanner input = new Scanner(System.in);

        int numb1;
        int numb2;
        System.out.print("Bir sayi giriniz: ");
        numb1 = input.nextInt();

        System.out.print("Bir sayi daha giriniz: ");
        numb2 = input.nextInt();

        System.out.println(numb1 / numb2);

        /********************** 2.Soru ******************************/

        double num1, num2, num3, sonuc;
        System.out.print("Bir sayi giriniz: ");
        num1 = input.nextInt();

        System.out.print("Bir sayi giriniz: ");
        num2 = input.nextInt();

        System.out.print("Bir sayi giriniz: ");
        num3 = input.nextInt();

        sonuc = num1 * num2 * num3;
        System.out.println("sonuc = " + sonuc);

        /********************** 3.Soru ******************************/

        sonuc *= sonuc;
        System.out.println(sonuc);

        /********************** 4.Soru ******************************/
        int n1 = 5;
        int n2 = 3;
        int n3 = 10;
        int n4 = 1;

        sonuc = n1 * n2 * n3 * n4;
        System.out.println("int sonuc = " + sonuc);

        /********************** 5.Soru ******************************/

        sonuc = num1 % num2;
        System.out.println(sonuc);

        /********************** 6.Soru ******************************/
        int fark = n1 - n2;
        System.out.println("fark = " + fark);

        /********************** 7.Soru ******************************/
        int cikar = n1 - n2 - n3 - n4;

        System.out.println("Sonuc = " + cikar);

        /********************** Ozel soru 1 ******************************/
        int sayimiz;
        System.out.print("Bir sayi yaziniz: ");
        sayimiz = input.nextInt();

        int birlerBasamak = sayimiz % 10;
        System.out.println("birlerBasamak = " + birlerBasamak);

        /********************** Ozel soru 2 ******************************/

        int onLarBasamak = (sayimiz % 100) / 10;
        System.out.println("onLarBasamak = " + onLarBasamak);
        /********************** Ozel soru 3 ******************************/

        int yuzlerBasamak = (sayimiz / 100);
        System.out.println("yuzlerBasamak = " + yuzlerBasamak);

        /********************** Ozel soru 4 ******************************/
        double finalNotu;
        double vizeNot;

        System.out.println("Final notunu giriniz: ");
        finalNotu = input.nextInt();

        System.out.println("vize notunu giriniz: ");
        vizeNot = input.nextInt();

        double ort = finalNotu * 0.60 + vizeNot * 0.40;

        System.out.println(ort);

        /********************** Ozel soru 5 ******************************/

        int tersi;

        System.out.println("3 basamakli sayi giriniz lutfen: ");
        tersi = input.nextInt();

        int yuzler = tersi/100;
        int onlar = (tersi%100)/10;
        int birler = tersi%10;

        System.out.println(birler + "" + (onlar) +""+ (yuzler));

    }
}
