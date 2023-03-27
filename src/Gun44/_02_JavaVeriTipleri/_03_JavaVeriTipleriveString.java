package Gun44._02_JavaVeriTipleri;

public class _03_JavaVeriTipleriveString {
    public static void main(String[] args) {
        int sayi1=5; // short,byte, long, float, char, boolean : primitive tipler

        int sayi2=10;

        // ilkel tipi durumu, herkesin kendi değer hücresi var      // Primative type kucuk int boolean double falan filan
        sayi1=sayi2;  // sayi1=10 ,sayi2=10
        sayi1=34;
        sayi2=45;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        // bunlar hafızada farklı yerlere sahipler

        //referans tipler
        int[] dizi1={1,2,3};  // 101  referans
        int[] dizi2={5,6};    // 202  referans

        dizi1=dizi2;
        dizi1[0]=67;
        System.out.println("dizi1[0] = " + dizi1[0]);
        System.out.println("dizi2[0] = " + dizi2[0]);


        //Nesne tipler                // Obje tipleri
        //String,Integer,Double,Long
        int sayi=5;
        Integer rakam= 4;
        //Null deger alabilen ilkel tiplerdir
        //referansa yakin ilkel gibi davranirlar

        String adi1="mehmet";
        String adi2="ali";
        adi1=adi2; //adi1=ali

        adi2="ayse";
        System.out.println("adi1 = " + adi1);
        System.out.println("adi2 = " + adi2);
    }
}
