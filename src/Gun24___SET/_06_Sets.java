package Gun24___SET;

import java.util.HashSet;

//retain // kesisim demek
public class _06_Sets {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        System.out.println("setA = " + setA);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setB = " + setB);

        /*BİRLESTİRME*/
        HashSet<Integer> birlesikHali = new HashSet<>();
        birlesikHali.addAll(setA); //toplu ekleme
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);

        /*FARKI*/
        HashSet<Integer> farki = new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB); //A dan B yi cikar
        System.out.println("farki = " + farki);

        /*ORTAK ELEMANLAR, KESİSİM*/

        HashSet<Integer> ortakElemanlar = new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
}
