package Gun33___OOP_Encapsulation._02_Ornek;

public class ArabaMain {

    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // SirketMain de 1 tane nesne oluşturup bunu kontrol ediniz.

    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.

    public static void main(String[] args) {

        Araba arb1 = new Araba();
        arb1.setRenk("Kirmizi");
        arb1.setModel(2022);
        arb1.setMotorHacmi(1600);
        arb1.setKapiSayisi(4);

        Araba arb2 = new Araba("Mavi", 202, 2600, 8);

        System.out.println("arb2 = " + arb2);
    }
}
