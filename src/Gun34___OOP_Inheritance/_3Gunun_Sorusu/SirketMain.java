package Gun34___OOP_Inheritance._3Gunun_Sorusu;

/*
    Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
    consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
    GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
    SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
    maaşları hesaplatıp, bordroyu yazdırınız
*/

public class SirketMain {
    public static void main(String[] args) {
        Calisan isci = new Calisan("Burak", 2500,4);


        System.out.println("isci.MaasHesaplama(): " + isci.MaasHesaplama() );
        System.out.println("Isci: " + isci);

        GenelMudur mudur = new GenelMudur("Senna", 2500,4, 300);
        System.out.println("mudur.MaasHesaplama(): " + mudur.MaasHesaplama());
        System.out.println("mudur: " + mudur);
    }
}
