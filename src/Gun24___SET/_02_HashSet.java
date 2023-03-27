package Gun24___SET;

import java.util.ArrayList;
import java.util.HashSet;

public class _02_HashSet {
    public static void main(String[] args) {
        // Static(Boyle mi deniliyor bilmiyorum) boyutlu olanlar gectik
        int sayi = 5;                                                         // hafizada 1 sayi saklar
        int [] dizi = new int[6];                                             // hafizada 6 sayi saklar
        int [][] tablo = new int[3][4];                                       // hafizada 12 sayi saklar

        // Dinamik boyutlu olanlar gectik
        ArrayList<Integer> liste = new ArrayList<>();                         // Boyu eklendikce artar
        ArrayList<ArrayList<Integer> > ListelerinListesi = new ArrayList<>(); // Dinamik boyut

        // Buna artık her eklenemeye çalışılan elemanı eklemeyecek, yani TEKRAR a izin
        // VERMEYEN bir dizi lazım(SET), bu kriterden hangi türlü sıra istiyorsam
        // LINKEDHashSet (Eklenme sırasına göre), TreeSet(herzaman sıralı), HashSet(Hızlı, sıra yok)
        // toplu işlemler için kullanıldığından index kavramı yoktur.
        // bir dizideki tekrarlı elemanlardan nasıl kurtulursun -> SETE atararak

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMiIlk = hs1.add(5);
        boolean tekrarEklendiMi = hs1.add(5);
        hs1.add(5);

        System.out.println("eklendiMiIlk = " + eklendiMiIlk);
        System.out.println("tekrarEklendiMi = " + tekrarEklendiMi);
        System.out.println("hs1 = " + hs1);
    }
}
