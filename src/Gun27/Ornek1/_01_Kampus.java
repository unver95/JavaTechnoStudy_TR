package Gun27.Ornek1;

// Bir kampus programı için asagıdaki özellikte bilgilerin
// kaydedileceği clasları yazınız.
// Okul :  adı, mudurAdi, ucreti(double)
// Ogrenci : okulNo, tamAd, okulu

// bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
// yazdırınız.


import java.util.Scanner;

public class _01_Kampus {
    public static void main(String[] args) {

        ogrenciOkulBilgileri(ogrenciKayit());
    }

    public static Ogrenci ogrenciKayit(){
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        Ogrenci ogrenciBilgileri = new Ogrenci();

        System.out.print("Ogrenci adi yazin: ");
        ogrenciBilgileri.tamAd = strInput.nextLine();
        System.out.print("Ogrenci okul no yazin: ");
        ogrenciBilgileri.okulNo = intInput.nextInt();

        return ogrenciBilgileri;
    }
    public static void ogrenciOkulBilgileri(Ogrenci kayit){
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        kayit.okul =new Okul();

        System.out.print("Ogrenci gittigi okul: ");
        kayit.okul.adi = strInput.nextLine();
        System.out.print("Ogrenci mudur adi: ");
        kayit.okul.mudurAdi = strInput.nextLine();
        System.out.println("Ogrenci okul ucreti ");
        kayit.okul.ucret = intInput.nextInt();

        System.out.println(kayit.okul.adi);
    }
}