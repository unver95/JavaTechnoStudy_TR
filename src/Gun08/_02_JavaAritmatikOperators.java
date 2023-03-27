package Gun08;

public class _02_JavaAritmatikOperators {
    public static void main(String[] args) {

        int sayac = 0;

        sayac= sayac+1; // Sayacinin degerini 1 artirir degeri = 1
        sayac++;        // sayacinin degerini 1 artirir degeri = 2
        ++sayac;        // sayacinin degerini 1 artirir degeri = 3

        sayac= sayac-1; // Sayacinin degerini 1 azaltir degeri = 2
        sayac--;        // sayacinin degerini 1 azaltir degeri = 1
        --sayac;        // sayacinin degerini 1 azaltir degeri = 0
        /*****************/

        int sonuc =0;
                sayac =0;


        sonuc = sayac++; // ++, -- ler sag tarafta ise yokmus gibi islemi yapacaz sonra ++ veya -- leri yapacaz
        sayac = sayac;
        sayac = sayac+1;
        //System.out.print(++x - x-- - x-- +x++);

        //++, -- lar solda
        sonuc =0;
        sayac =0;
        sonuc = ++sayac; // ++, -- ler sol tarafta ise once ++ veya -- leri yapilir sonra islem yapilir

        sayac=sayac+1;
        sonuc = sayac;

        //                 Benim ornek daha iyi anlamak icin.
                int x = 2;
        //System.out.print(++x - x++ - x-- + x++);
        System.out.println(++x);
        System.out.println(x);
        System.out.println(- x++);
        System.out.println(x);
        System.out.println(- x--);
        System.out.println(x);
        System.out.println(+ x++);
        System.out.println(x);

    }
}
