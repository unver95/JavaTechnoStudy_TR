package Gun34___OOP_Inheritance._2Ornek2;

// Bir tane hayvanak Bahcesi main yap
// Bir haycan klass yap Super klass yap
//  bu renk, kilo, cins field ekle sonra hayvan konsutu metot yap calisitigidna sout olsun
// 2 tane hayvan olustur
// konustugu overright yapip sout u degistir havan sesine


public class HayvanakBahcesi {
    public static void main(String[] args) {

        Kedi kedi = new Kedi("Beyaz", 20, "Van");
        kedi.HayvanSesi();

        Kopek k = new Kopek("Siyah", 35, "Kangal");
        k.HayvanSesi();

    }
}
