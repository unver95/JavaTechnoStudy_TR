package Gun02;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters

        // \n -> yeni satir aciyor, alt satira geciyor
        // \t -> tab tusuna basilmis gibi yapiyor (Ornel: Burak     Unver)
        // \b -> Backspace basilmis etkisi yapar, yani 1 karater geri siler
        // \" -> cift tirnak yazar yazinin icine
        // \\ -> \ isaretini direk yazar.
        // \r -> Satir basina geri gidiyor ve satir basina kadar olan karaterleri hepsini siler


        System.out.println("Hello World");
        System.out.println("Hello\nWorld");  // \n
        System.out.println();                // ara da bosluk olsun diye yazdim ben
        System.out.println("Hello\tWorld");  // \t TAB e basilmis gibi
        System.out.println("Hello\bWorld");  // \b Bir once ki karateri siliyor bu ornekte "o" sildindi
        System.out.println("Hello\"World");  // \"
        System.out.println("Hello\\World");  // \\
        System.out.println("Burak Unver Hello\rWorld JAVA");  // \r
        //Cevaplari:

        /*
        Hello               // \n
        World               // \n
                            // ara da bosluk olsun diye yazdim ben
        Hello	World       // \t
        HellWorld           // \b
        Hello"World         // \"
        Hello\World         // \\
        World               // \r \r den once kilerinin hepsini siler
        */
    }
}
