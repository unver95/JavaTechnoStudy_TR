package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Senna", "Akbas", "Ogrenci", "2A");
        Calisan cls = new Calisan("Ismet", "Temur", "Ogretmen", "IT");

        Kisi.KimlikYazdirma(ogr1);
        Kisi.KimlikYazdirma(cls);
    }
}
