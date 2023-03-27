package Gun24___SET;

import java.util.HashSet;
import java.util.Iterator;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmedi ayni lar eklenmez cunki Setlerde
        renkler.add("RED"); // bu eklendi aynisi yok

        // Ektrana yazdirma
        System.out.println("renkler = " + renkler);

        // Ekrana yazdirma tek tek
        for (String eleman : renkler) { // foreach

            System.out.println("eleman = " + eleman);
        }

        // Icindeki siranin garanti edildigi yontem
        Iterator gosterge = renkler.iterator();  // Havizada ki ilk kutucugu yerini aldim,
        // ben adim adim gitcem, boylece icindeki sirayi takip edecegim.

        // Adim adim gitme, bir sonraki bir sonraki
        while (gosterge.hasNext()) {   // Bir sonrakisi var mi ?
            System.out.println("gosterge.next() = " + gosterge.next());  // o kutucugu yazdi
            // if (boylese) gosterge.remove(); // o andaki kutucugu siler
        }
    }
}
