package Gun28.Onrek3;

import java.util.ArrayList;

public class Student {
    String name;

    int maxCredit=10;

    ArrayList<Lesson> dersListesi=new ArrayList<>();

    static void kurallariYazdir() {
        System.out.println("Kural 1: Lütfen 10 krediyi gecmeyecek sekilde ders sec /n" +
                "Kural 2: kaydi kesinlestirmeden kontrol et");
    }

    void dersSecimi(Lesson ders) {

        int toplamSaat = 0;
        for (Lesson d : dersListesi)
            toplamSaat += d.saat;


        if (toplamSaat + ders.saat > maxCredit) {

            System.out.println(maxCredit + "'i gecmeyecek sekilde secim yap!!!");
        } else
            dersListesi.add(ders);
    }
    void dersleriYazdir()
    {
        System.out.println("****** /nTranscript ******");
        System.out.println("Sayin " + name);
        System.out.println("Aldiginiz dersler ve credileri asagidaki gibidir: ");
        for (Lesson l:dersListesi ) {
            System.out.println(l.name+" "+l.saat);
        }
    }
}
