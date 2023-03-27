package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace: Bir stringin icinde ki karater(ler)in verilenlerle degistirir. Hepsini.

        String text = "Merhaba Dunya";

        System.out.println("Textin orjinal hali: " + text);                                     // Merhaba Dunya
        System.out.println("a -> e:" + text.replace("a", "e"));                 // Merhebe Dunye  -> "a" lar "e" ile degisti.
        System.out.println("ba -> de: " + text.replace("ba", "de"));         // Merhade Dunya.
        System.out.println("Dunya -> JAva: " + text.replace("Dunya", "Java")); // Merhaba Java.
        System.out.println("a lari silelim:" + text.replace("a", ""));       // Merhb Dunya
        System.out.println("Bosluklari siler:" + text.replace(" ", ""));     // MerhabaDunya


    }
}
