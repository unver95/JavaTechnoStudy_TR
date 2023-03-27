package Gun35.Odev.Soru_5;

/*
5- Bir okulun çalışanı ve öğrencilerinin kayıt altına alındığı bir program yapılmak isteniyor.
1- Calisan ların isim, adres, Okul, maas ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
2- Öğrenci lerin isim, adres, Okul, ücret ve UyeTipi (Enum: Ogrenci, Calisan)  bilgileri vardır.
3- Okul un ise ismi, maxOgrenciSayisi, Öğrencileri ve Calisanlari vardır.
4- Main kısmında 2 öğrenci 2 çalışan oluşturup, bunları okula ekleyiniz. ve sonra listeletiniz.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci("Neeko", "League of Legends mh.", "Atatur okulu", 2500 ,UveyTipi.Ogrenci);
        Ogrenci ogr2 = new Ogrenci("Senna", "Sincap mh", "Sincap lisesi", 1500 ,UveyTipi.Ogrenci);

        ArrayList<Ogrenci> ogrListeleri = new ArrayList<>();
        ogrListeleri.add(ogr1);
        ogrListeleri.add(ogr2);

        Calisanlar cls1 = new Calisanlar("Burak", "MaaskantSraat", "Pijler", 30000 ,UveyTipi.Calisan);
        Calisanlar cls2 = new Calisanlar("Amumu", "Vuurplaat", "Deniz yilmaz lisesi", 80000 ,UveyTipi.Calisan);

        ArrayList<Calisanlar> clsListeleri = new ArrayList<>();
        clsListeleri.add(cls1);
        clsListeleri.add(cls2);

        Okul okl = new Okul("Demir Lisesi", 4, ogrListeleri, clsListeleri);

        System.out.println(ogrListeleri);
        System.out.println(clsListeleri);
    }
}
