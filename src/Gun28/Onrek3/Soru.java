package Gun28.Onrek3;

// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxSaat, dersleri listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz. -> Nesneye(Obje) ait
//    ders eklerken max alabileceği Saati geçmemeli, geçerse
//    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.
//    En Basta yazdiriniz -> Tipe(Class) ait


import java.util.ArrayList;

public class Soru {
    public static void main(String[] args) {

        Lesson d1 = new Lesson();
        d1.name = "Mat 101";
        d1.saat = 3;

        Lesson d2 = new Lesson();
        d2.name = "Kimya 103";
        d2.saat = 5;

        Lesson d3 = new Lesson();
        d3.name = "Fizik 105";
        d3.saat = 3;

        Student.kurallariYazdir();

        Student s1 = new Student();
        s1.name = "sena";

        s1.dersSecimi(d1);
        s1.dersSecimi(d2);
        s1.dersSecimi(d3);

        s1.dersleriYazdir();

    }
}