package Gun27.Ornek4;

/*      1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı(fatura)  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

import Gun30._01_ClassErisimleri.PaketBir.PublicErisim;

public class EnerjiSA {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.name = "ismet temur";
        mus1.elektrikHesabi = new ElektrikHesabi();

        mus1.elektrikHesabi.toplamTuketimYaz();

        mus1.elektrikHesabi.tuketunEkle(34);
        mus1.elektrikHesabi.tuketunEkle(50);
        mus1.elektrikHesabi.tuketunEkle(100);

        mus1.elektrikHesabi.toplamTuketimYaz();
        mus1.elektrikHesabi.faturaYaz(mus1.name);
    }
}
