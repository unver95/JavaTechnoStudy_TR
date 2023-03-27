package Gun07;

public class _09_StringReplaceFirst {
    public static void main(String[] args) {
        // replace: Bir stringin icinde ki karater(ler)in verilenlerle degistirir. Sadece ilkini

        String text = "Herkese Merhaba Dunya";

        System.out.println("Textin orjinal hali: " + text);                                             // Herkese Merhaba Dunya

        System.out.println("a->e) = " + text.replaceFirst("a", "e"));                   // Herkese Merheba Dunya
        System.out.println("ba->de) = " + text.replaceFirst("ba", "de"));               // Herkese Merhade Dunya
        System.out.println("Dunya->Java = " + text.replaceFirst("Dunya", "Java"));      // Herkese Merhaba Java
        System.out.println("ilk a yı silelim = " + text.replaceFirst("a", ""));         // Herkese Merhba Dunya
        System.out.println("ilk boslugu silelim = " + text.replaceFirst(" ", ""));      // HerkeseMerhaba Dunya
    }
}
