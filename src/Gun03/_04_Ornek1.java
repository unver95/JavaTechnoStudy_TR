package Gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {

        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çeversini ve alanını bulunuz
        // carpma : * kullaniliyor
        // bir kernari a ise, diger kenari b ise, cevre = a+a+b+b, alan =a*b;

        int a = 4;
        int b =9;
        int cevre;
        int alan;
        cevre = a*2 + b*2;
        alan = a*b;
        System.out.println("Sonuc= "+ cevre + "\nalan: " +alan);


    }
}
