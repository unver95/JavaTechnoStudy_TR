package Gun32___Enum.Ornek_2;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay = Aylar.AGUSTOS;

        // Ayin kac surdugunu metod gerekiyor
        // Ayin turkce yazilisi metod gerekiyor
        // Ayin gercek sira no su metod gerekiyor

         // Java diyor ki bu sekilde tek bir kelime veya
         // sayi olan degerleri olacaksa sana bir kolaylik

        System.out.println("ay = " + ay);
        System.out.println("ay.ayno = " + ay.ayno);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);
    }
}
