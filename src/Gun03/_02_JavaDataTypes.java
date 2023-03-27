package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
        int sayi=1; // Butun tam sayilar kendi baslarken defualt INT gorurlur.

        // Integer (Tam sayilar)

        byte byteDeger= 7;            // -128 127 e kadar tum sayilar
        short shortDeger=1645;
        long longDeger= 12344123212l; // Defualt olarak INT goruyor o yuzden "l" yazman gerek sonda, long kullandiginda.

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Decimals (On dalik sayilar)
        // Defualt olarak butun ondalikli sayilari DOUBLE kabul eder.
        double doubleDegeri = 3.1231510000001;

        float floatDeger= 3.14005f;   // Decimals (On dalik sayilar) defualt olarak DOUBLE olarak gorulur o yuzden "f" kullanman gerek float un sonunda.


//------------------------------------------------------------------------------------------------------------------------------------------------------------------
        char basHarf= 'A';            // Sayi olarak sakliyor karakater tablosuna bakarar orda da A nin degeri 65 dir.
        boolean evetMi= true;         // Sadece 2 deger olabilir true yada false. (Defualt false dur)


//------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //soutv yazarak kisatlmasini bula bilirisin gerisini otomatik yaziyor " =" + falan diye.
        // manuel icin sadece sout yaz icini kendin doldur.
        System.out.println("evetMi = " + evetMi);
        System.out.println("sayi = " + sayi);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDegeri = " + doubleDegeri);
        System.out.println("longDeger = " + longDeger);
        System.out.println("shortDeger = " + shortDeger);
    }
}
