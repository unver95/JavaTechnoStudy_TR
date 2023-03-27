package Gun12;

import java.util.Scanner;

public class _03_JavaIfElseIf_REGEX {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.


                                                 // TODO: REGEX //
        Scanner oku = new Scanner(System.in);
        System.out.println("Ders ve notu: "); // Fizik: 77     Kimya90
        String dersNot = oku.nextLine();

        int ogrNot= Integer.parseInt( dersNot.replaceAll("[^0-9]","") ) ; // 0-9 dışındakile boşaltıldı
        String dersAd =dersNot.replaceAll("[0-9]","");  // sayıları boşalt

        System.out.println("dersAd: " + dersAd);
        System.out.println("orgNot: " + ogrNot);

        if (ogrNot >= 90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >= 40)
            System.out.println("E");
        else
            System.out.println("F");


   /*     Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int puan;
        String dersAdi;

        System.out.print("Hangi derse puan verecen: ");
        dersAdi = input.nextLine();

        System.out.print("Kac puan aldi: ");
        puan = str.nextInt();

        if (puan >= 90) {
            System.out.println(dersAdi + ": " + puan + " A");
        } else if (puan >= 80) {
            System.out.println(dersAdi + ": " + puan + " B");
        } else if (puan >= 70) {
            System.out.println(dersAdi + ": " + puan + " C");
        } else if (puan >= 60) {
            System.out.println(dersAdi + ": " + puan + " D");
        } else if (puan >= 40) {
            System.out.println(dersAdi + ": " + puan + " E");
        }else if (puan < 40) {
            System.out.println(dersAdi + ": " + puan + " F");
        }*/

    }
}
