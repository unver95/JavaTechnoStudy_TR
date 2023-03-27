package Gun33___OOP_Encapsulation.Gunun_Sorusu.Hocanin.Cozumu;

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


import java.util.Scanner;

public class Okulmain {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        String ad;
        String soyad;
        int yas;


        Okul o1 = new Okul("yıldıırm", 3);

        do {
            System.out.println("isim");
            ad = strInput.nextLine();
            System.out.println("soyad");
            soyad = strInput.nextLine();
            System.out.println("yas");
            yas = intInput.nextInt();

            if (yas < 15) {
                Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);
                o1.ogrenciArrayList.add(ogrenci);
            } else {
                System.out.println("Yasi buyuk, baska ogrenci girin lutfen rica ederim: ");
            }
        }
        while (o1.ogrenciArrayList.size() < o1.getKontenjan());


        System.out.println(o1);
        System.out.println(o1.ogrenciArrayList);
    }
}