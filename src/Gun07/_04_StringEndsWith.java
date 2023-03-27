package Gun07;

public class _04_StringEndsWith {
    public static void main(String[] args) {
        //EndsWith: Verilen karakter(ler) ile bitiyor mu.
        // Sonuc: True veya False yani boolean doner.

        String text = "Merhaba dunya";

        System.out.println("ya ile bitiyor mu: " + text.endsWith("ya"));      // True
        System.out.println("Ya ile bitiyor mu: " + text.endsWith("Ya"));      // False
        System.out.println("A ile bitiyor mu: " + text.endsWith("A"));        // False
        System.out.println("a ile bitiyor mu: " + text.endsWith("a"));        // True
        System.out.println("ny ile bitiyor mu: " + text.endsWith("ny"));      // False cunku ya ile bitiyor.
        System.out.println("dunya ile bitiyor mu: " + text.endsWith("dunya"));// true
        System.out.println("nya ile bitiyor mu: " + text.endsWith("nya"));    // true
    }
}
