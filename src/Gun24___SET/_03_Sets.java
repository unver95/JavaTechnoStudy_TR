package Gun24___SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet : Hızlı, bunun için kendine özel bir sırada saklar
        // LinkedHashSet : eklendiği sırada saklar
        // TreeSet : herzaman sıralı tutar, kendinden sortlu


        // Hizli calismak icin kendine ozel bir sirada saklar
        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);

        // Eklenme sirasina gore elemanlarini saklar
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        // Herzaman sirali tutar, kendinden sortlu
        TreeSet<String> ts= new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);

    }
}
