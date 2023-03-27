package Gun45._02_ExeptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program basladi");

        try { // dene, hatanin basladigi yerin ustube konur
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY, 30);

        } // Hata oldugu zaman programi kirma
        catch (Exception ex) { // ex isimli degiskende olusan hatalarin bilgisi ataniyor
            System.out.println("Hata olustu lutfen tekrar deneyiniz..");
            // System.out.println("ex.toString()" + ex.toString());
            // Kendine mail atti: gelen detayo ve hatayi
            // Veritabanin kalici yer yaz
        }

        System.out.println("Program calismaya devam etti");
        System.out.println("Program bitti");


        try {
            // Java calismaya devam
            // konulari ogrenmeye devam

        }  // anlamadigin yer mi oldu ? Kirilmadan DEVAM
        catch (Exception ex){
            // Hatanin sebebini anla
            // derse daha fazla odaklan
            // gereken videolari tekrar izle
            // arkadaslarina hocana mutlaka sor
            // ogren ve kirilmadan devam et
        }
        // sonunda seni guzel bir meslek bekliyor
    }
}
