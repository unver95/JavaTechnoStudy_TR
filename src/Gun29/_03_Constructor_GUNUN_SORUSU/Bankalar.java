package Gun29._03_Constructor_GUNUN_SORUSU;

// Bir banka class ı tanımlayınız.
// 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
// 3 adet constructor ekleyin.
// toString metodu oluşturun.
// 3 tane nesne oluşturup mainde yazdırınız.

public class Bankalar {
    public static void main(String[] args) {

        Banka banka1 = new Banka("Granti", 345, 1995);
        Banka banka2 = new Banka("IsBankasi", 69);
        Banka banka3 = new Banka("Akbank");

        System.out.println(banka1);
    }
}
