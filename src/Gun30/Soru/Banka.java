package Gun30.Soru;

// Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
// Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
// Bir banka uygulaması için 1 müşteri tanımlayınız,
// müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
// Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
// bakiyeye direk para atanamadıgını kontrol ediniz.

public class Banka {
    public static void main(String[] args) {

        Musteri muz1 = new Musteri();

        muz1.ad = "Senna";
        muz1.soyad = "Neeko";
        muz1.hesapID = 69420;

        muz1.hesap = new Hesap();

        muz1.hesap.yatirilanPara(100);
        muz1.hesap.yatirilanPara(200);
        muz1.hesap.cekilenPara(50);

        muz1.hesap.bakiye();

    }
}
