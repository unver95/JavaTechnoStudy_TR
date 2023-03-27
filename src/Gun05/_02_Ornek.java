package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        //Girilen bir adi ekrana yazdiriniz.
        String ad;
        Scanner okuyucu = new Scanner(System.in);

        System.out.print("Adini gir: "); //println degil cunku o zaman alt satira geciyor, print yaparsan direk yanina yazarsin
        ad = okuyucu.next(); // next() -> bir kelime okumak icin
        System.out.println("Adiniz " + ad);

        /*
        okuyucu.next() -> Bir kelime okur  (Ornek: Burak Unver sonuc sadece Burak cikar)
         oku.nextLine() -> tüm satırı okur (Ornek: Burak Unver sonuc sadece Burak Unver cikar)

         oku.nextInt() ->  int değeri okur
         oku.nextByte() -> byte degerı okur
         oku.nextLong() -> long degeri okur
         oku.nextShort() -> Short degeri okur

         oku.nextFloat() -> float degeri okur
         oku.nextDouble() -> double degeri okur
         */
    }
}
