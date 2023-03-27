package Gun31_Hafta_8._2_FinalModifier.Ornek2;

// Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
// tcNo değerini int olarak alınız ve nesne oluşturulurken
// sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
// kontrol için mainde 2 kişi tanımlayınız.
// tc nonu değiştirilemediğini kontrol ediniz.

public class VatandaslikProgrami {
    public static void main(String[] args) {

        Vatandas v1 = new Vatandas("Ismet");
        Vatandas v2 = new Vatandas("Ufuk");
        Vatandas v3 = new Vatandas("Ayser");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
    }
}
