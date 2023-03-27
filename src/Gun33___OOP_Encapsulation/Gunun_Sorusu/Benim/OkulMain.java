package Gun33___OOP_Encapsulation.Gunun_Sorusu.Benim;

//  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
//  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
//  3- Bütün fieldlar için encapsulation uygulayınız.
//  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
//     ArrayList cinsinden Öğrencileri olsun.
//  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
//     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
//  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        String ad;
        String soyad;
        int yas;


        ArrayList<Ogrenci> ogrenciArrayList=new ArrayList<>();
        Okul o = new Okul("Yildiz Okul",ogrenciArrayList);


        for (int i = 0; i < o.kontenjan; ) {

            Ogrenci ogr = new Ogrenci();
            System.out.println("isim");
            ad = strInput.nextLine();
            ogr.setAd(ad);
            System.out.println("soyad");
            soyad = strInput.nextLine();
            ogr.setSoyad(soyad);
            System.out.println("yas");
            yas = intInput.nextInt();
            ogr.setYas(yas);


            if (ogr.getYas() < o.getYasSiniri()) {
                ogrenciArrayList.add(ogr);
                Ogrenci.sayac++;
                i++;
            } else {
                System.out.println("Yasi buyuk, baska ogrenci girin lutfen rica ederim: ");
            }
        }
        for(Ogrenci parcala : ogrenciArrayList){
            System.out.println("ad: "+parcala.getAd());
            System.out.println("soyad: " + parcala.getSoyad());
            System.out.println("yas: " + parcala.getYas());
            System.out.println("ID:" + parcala.getId());
        }
    }
}
