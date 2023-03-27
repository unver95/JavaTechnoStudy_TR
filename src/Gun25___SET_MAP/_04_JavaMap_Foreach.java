package Gun25___SET_MAP;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap_Foreach {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Birakan Yildiz");
        hm.put(2001, "Hasan Asik");
        hm.put(5001, "Neeko");
        hm.put(2021, "Eyupcan Bilgin");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k : hm.keySet()) {
            System.out.println("k = " + k);
        }
        for (String v : hm.values()) {
            System.out.println("v = " + v);
        }


        // Entry -> girilen(veri), EntrySet -> girilenlerin seti yani veriler
        for (Map.Entry<Integer, String> zm : hm.entrySet()) {  //entrySet: Butun veriler
            System.out.println("zm.getKey() = " + zm.getKey());
            System.out.println("zm.getValue() = " + zm.getValue());
        }

        for (Map.Entry<Integer, String> qa : hm.entrySet()) {  // entrySet: Butun veriler
               System.out.println("Anahatar ve deger = " + qa.getKey()+ "-" + qa.getValue());
        }
    }
}