package Projeler._1_Proje_Banka.bankAccount;


import java.time.LocalDate;
import java.util.Scanner;

public class Musteriler {

    // 8. Adım
//    -- String tipinde "ad" ,"sifre", "dogumTarihi", "medeniHali", "kefilTamAd", "kefilYasi", değişkenlerini oluşturun.
//    -- int tipinde hesapNo1, hesapBakiye1 , hesapNo2 , hesapBakiye2   değişkenlerini oluşturun.
//    -- hepsi public olmalıdır.


    public String ad;
    public String sifre;
    public String dogumTarihi;
    public String medeniHali;
    public String kefilTamAd;
    public String kefilYasi;
    public static int hesapNo1;
    public int hesapBakiye1;
    public static int hesapNo2;
    public int hesapBakiye2;

//----------------------------------------------------------------------------------------------------------------------

    // 9. Adım
//   -- Parametreleri String ad , sifre , dogumTarihi , medeniHali ve
//      Int hesapBakiye1 , hesapBakiye2 bir olan constructor oluşturun
//   -- Class ad parametre ad a eşitle.
//   -- Class sifre parametre sifre ye eşitle.
//   -- Class hesapBakiye1 parametre hesapBakiye1 e eşitle.
//   -- Class hesapBakiye2 parametre hesapBakiye2 ye eşitle.
//   -- Class hesapNo1 randomHesapNoOlustur() methoduna eşitle ve değerini oradan almalı.
//   -- Class hesapNo2 randomHesapNoOlustur() methoduna eşitle ve değerini oradan almalı.
//   -- Class medeniHali medeniHalKontrol() methoduna eşitlenmeli ve metod parametresi medeniHali parametresini almalı.
//   -- Class dogumTarihi yasKontrol() methoduna eşitlenmeli ve metod parametresi dogumTarihi parametresini almalı.

    public Musteriler(String ad, String sifre, String dogumTarihi, String medeniHali, int hesapBakiye1, int hesapBakiye2) {
        this.ad = ad;
        this.sifre = sifre;
        this.hesapBakiye1 = hesapBakiye1;
        this.hesapBakiye2 = hesapBakiye2;
        hesapNo1 = randomHesapNoOlustur();
        hesapNo2 = randomHesapNoOlustur();
        this.medeniHali = medeniHalKontrol(medeniHali);
        this.dogumTarihi = yasKontrol(dogumTarihi);

    }


//----------------------------------------------------------------------------------------------------------------------

    // 10. Adım
//    -- Parametresi String medeniHali ve return tipi String olan medeniHalKontrol() methodunu oluşturun
//    -- Eğer medeni hali "Evli" ise
//       - Kullanıcıya sor ( scanner class kullanın)
//       "Kefil eklemek istiyor musunuz ? : "
//       - Kullanıcı "Evet" derse kullanıcıya sor
//       "Kefilin adı ? : "
//       - Kullanıcıya sor
//       "Kefilin doğum tarihi ? : "
//       Sonra KefilEkle(kefilTamAdi, kefilDogumTarihi) ekleyin (Classın nesnesini oluşturun yani classı new leyin)
//       kefilTamAd değişkeni KefilEkle classındaki tamAd a eşitleyin.
//       kefilYasi değişkeni KefilEkle classındaki yas a eşitleyin.//
//    -- Eğer kefilYasi "0" a eşit ise
//       kefilTamAd i "Kefil 18 yaşından büyük olmalıdır." ile değiştir(Yani kefilin yaşı tutmadığı için adına bu mesajı yazın)
//       kefilYasi "Kefil 18 yaşından büyük olmalıdır." ile değiştir(Yani kefilin yaşı tutmadığı için adına bu mesajı yazın)
//       returnü de "Kefil 18 yaşından büyük olmalıdır." mesajını göndermeli.
//    -- Eğer kefilYasi "0" a eşit değilse
//       return "İşlem başarılı" mesajını döndürmeli.
//
//    -- Eğer kullanıcı Hayır derse hiçbirşey eklemeye gerek yok.
//       return null olmalıdır.
    public String medeniHalKontrol(String medeniHali) {

        if (medeniHali.equalsIgnoreCase("evli")) {
            Scanner oku = new Scanner(System.in);
            System.out.print("Kefil eklemek istiyor musunuz ? : ");
            String kefilDurumu = oku.nextLine();
            if (kefilDurumu.equalsIgnoreCase("evet")) {
                System.out.print("Kefilin adı ? : ");
                String kefilTamAdi = oku.nextLine();
                System.out.print("Kefilin doğum tarihi ? : ");
                String kefilDogumTarihi = oku.nextLine();
                KefilEkle kefil = new KefilEkle(kefilTamAdi, kefilDogumTarihi);
                this.kefilTamAd = kefil.tamAd;
                this.kefilYasi = kefil.yas;

                if (kefilYasi.equals("0")) {
                    this.kefilTamAd = "Kefil 18 yaşından büyük olmalıdır.";
                    this.kefilYasi = "Kefil 18 yaşından büyük olmalıdır.";
                    return "Kefil 18 yaşından büyük olmalıdır.";
                } else return "İşlem başarılı";
            }
        }
        return null;
    }


//----------------------------------------------------------------------------------------------------------------------


  // 11. Adım
//     -- Parametresi String dogumTarihi ve return  tipi String olan yasKontrol adında static methodunu oluşturun
//     -- güncel yılı (buYil) dogumTarihi ile karşılaştırın.
//     -- Eğer çıkan sonuç 18 e eşit ve büyük ise "Kredi kartı alabilirsiniz." mesajını return edin.
//     -- Eğer çıkan sonuç 18 den küçük ise "Kredi kartı alabilmek için en az 18 yaşında olmalısınız."
//        mesajını return edin.

//        Örnek buYil 10/05/2022 ise
//        Eğer dogumTarihi  09/05/2000 ise
//        return "Kredi kartı alabilirsiniz." olmalı
//        Eğer   myDOB  11/05/2005  ise
//        return "Kredi kartı alabilmek için en az 18 yaşında olmalısınız." olmalı

    public static String yasKontrol(String dogumTarihi) {
        int buYil = LocalDate.now().getYear();
        int dogumYili = Integer.parseInt(dogumTarihi.substring(dogumTarihi.length() - 4));
        if ((buYil - dogumYili) >= 18) {
            return "Kredi kartı alabilirsiniz.";
        } else return "Kredi kartı alabilmek için en az 18 yaşında olmalısınız.";
    }

//----------------------------------------------------------------------------------------------------------------------

    // 12. Adım
//      -- 8 basamak sayı döndüren Random sayı metodu oluşturun.
//         Bu sayı  10000000 - 99999999 arasında olamalı.


    public int randomHesapNoOlustur() {

        return (int) (Math.random() * ((99999999 - 10000000) + 1)) + 10000000;
    }

//----------------------------------------------------------------------------------------------------------------------


    // 12. Adım
//    -- Parametresi iki tane Musteriler object1 ve object2 olan return tipi void olan transfer adında method oluşturun.
//    -- Bu method içinden önce kullanıcıya sor
//      "Hesaplarınız arasında mı yoksa farklı bir kullanıcı arasında mı transfer yapmak istiyorsunuz? : "(scanner class kullan)
//       - Eğer cevap "Kendi" ise
//        "Transfer etmek istediğiniz miktarı giriniz : " mesajını gönderiniz (scanner class kullan)
//       Hesap classı içinde virman methodunu çağırın.
//      - Eğer cevap farklı ise
//        "Transfer etmek istediğiniz miktarı giriniz : " mesajını gönderiniz (scanner class kullan)
//       Hesap class içinde baskaHesabaHavale methodunu çağırın.

    public void transfer(Musteriler obje1, Musteriler obje2) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        System.out.print("Hesaplarınız arasında mı yoksa farklı bir kullanıcı arasında mı transfer yapmak istiyorsunuz? : ");
        String secim = okuStr.nextLine();
        int miktar = 0;
        if (secim.equalsIgnoreCase("kendi")) {
            System.out.print("Transfer etmek istediğiniz miktarı giriniz : ");
            miktar = okuInt.nextInt();
            Hesap.virman(obje1, miktar);
        } else {
            System.out.print("Transfer etmek istediğiniz miktarı giriniz : ");
            miktar = okuInt.nextInt();
            Hesap.baskaHesabaHavale(obje1, obje2, miktar);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 13. Adım
//       toString methodunu kullanarak objecti yazdırın.
//      Örnek :
//    public String toString() {
//        return {"\n Musterinin adı          : " + ad +
//                "\n Musterinin şifresi      : " + sifre +
//                "\n Musterinin dogum tarihi : " + dogumTarihi
//                .
//                .
//                .
//                  }; gibi

    public static void raporYukleniyor() {
        System.out.println("\u001b[32;1mRapor yükleniyor... \u001b[0m");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = i / 10; j > 0; j--) {
                System.out.print("\u001b[42m" + "   " + "\u001b[0m");
            }
            System.out.print(" " + (i + 1) + "%\r");
        }
    }

//----------------------------------------------------------------------------------------------------------------------

// ***Videodaki süsleme işlemlerinden fikir edinerek sizlerde benzer veya daha farklı durumlar hazırlayabilirsiniz.***

//----------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "\n\u001b[31;1m { \u001b[0m" +
                "\n Musterinin adı          : " + "\u001b[31;1m " + ad + "\u001b[0m" +
                "\n Musterinin şifresi      : " + "\u001b[31;1m " + sifre + "\u001b[0m" +
                "\n Musterinin dogum tarihi : " + "\u001b[31;1m " + dogumTarihi + "\u001b[0m" +
                "\n Musterinin medeni hali  : " + "\u001b[31;1m " + medeniHali + "\u001b[0m" +
                "\n Hesap No-1              : " + "\u001b[31;1m " + hesapNo1 + "\u001b[0m" +
                "\n Hesap Bakiyesi-1        : " + "\u001b[31;1m " + hesapBakiye1 + "\u001b[0m" +
                "\n Hesap No-2              : " + "\u001b[31;1m " + hesapNo2 + "\u001b[0m" +
                "\n Hesap Bakiyesi-2        : " + "\u001b[31;1m " + hesapBakiye2 + "\u001b[0m" +
                "\n Kefilin tam adı         : " + "\u001b[31;1m " + kefilTamAd + "\u001b[0m" +
                "\n Kefilin yaşı            : " + "\u001b[31;1m " + kefilYasi + "\u001b[0m" +
                "\n\u001b[31;1m }\u001b[0m";
    }
}
