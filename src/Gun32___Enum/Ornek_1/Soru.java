package Gun32___Enum.Ornek_1;

// Bir User yetkilendirme modülü yapılması isteniyor.
// USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
// USER STATUSU : AKTIF, PASIF
// Yukarıdaki şekilde bir USER(userName) class ı tanımlayınız
// Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
// kullanıcısı tanımlayınız.
// UserSilme isimli fonksiyona bu userları gönderiniz.
// ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

public class Soru {
    public static void main(String[] args) {
        User user1 = new User("Neeko", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Burak", Role.SATIS, Statu.PASSIF);
        User user3 = new User("Senna", Role.PERSONEL, Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);
    }

    public static void userSil(User kullanici){
        if(kullanici.role == Role.ADMIN){
            System.out.println("Admin silinemez");
        }else {
            // bu bolumde silme islemini yapildi (Yukarda ArrayListe attip burda userlari ordan silmek gerek)
        }
    }
}
