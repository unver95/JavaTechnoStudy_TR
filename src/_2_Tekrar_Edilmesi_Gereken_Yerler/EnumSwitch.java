package _2_Tekrar_Edilmesi_Gereken_Yerler;

enum Islem{
    TOPLA, CIKAR,
    CARP, BOL
}

public class EnumSwitch {
    public static void main(String[] args) {

        // Verilen rakamlari istenilen matematik islemi ile sonucunu hesaplayan bir method yaziniz
        System.out.println(hesapla(Islem.TOPLA, 23, 12));
    }

    public static int hesapla(Islem islem, int sayi1, int sayi2) {

        int sonuc = 0;
        switch (islem) {
            case TOPLA:
                sonuc = sayi1 + sayi2;
                break;
            case CIKAR:
                sonuc = sayi1 - sayi2;
                break;
            case CARP:
                sonuc = sayi1 * sayi2;
                break;
            case BOL:
                sonuc = sayi1 / sayi2;
                break;
        }
        return sonuc;
    }
}
