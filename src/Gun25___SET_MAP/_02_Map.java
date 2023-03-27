package Gun25___SET_MAP;

import java.util.HashMap;

public class _02_Map {
    public static void main(String[] args) {
        /*
         SET -> HashSet, LinkedHashSet, TreeSet
         Map -> HashMap, LinkedHashMap, TreeMap
         */


        // Anahtarminin tipini Integer, degerlerimin tipi String olacak
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Birakan Yildiz");
        hm.put(2001, "Hasan Asik");
        hm.put(5001, "Neeko");
        hm.put(2001, "Eyupcan Bilgin"); // 2001 deki bilgiyi GUNCELLIYOR

        System.out.println("hm = " + hm);
        System.out.println("hm.get(1002) = " + hm.get(1002));
        System.out.println("hm.get(1002) = " + hm.get(2001));
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        
        hm.remove(2001); // 2001 anahtarindaki eleman silindi.
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        hm.clear();
        System.out.println("hm = " + hm);
    }
}