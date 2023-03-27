package Gun06_Hafta_3;

public class _08_StringContains {
    public static void main(String[] args) {
        // Contains: Bir stringin icerisinde karakter(lerin) var olup olmadigini boolean cinsinden soyle true veye false.

        String cumle= "Merhaba Dunya";

        // 1. Yontem
        boolean varMi = cumle.contains("a");
        System.out.println("varMi 1. yontem = " + varMi);

        //Direkt de yapila bilir
        System.out.println("varMi 2. yontem= " + cumle.contains("a"));
        System.out.println("varMi 2. yontem= " + cumle.contains("ya"));
        System.out.println("varMi 2. yontem ama yanlis olan= " + cumle.contains("K"));
        System.out.println("varMi 2. yontem ama yanlis olan= " + cumle.contains("m")); // kucuk m olmadigi icin bu yanlis.
        System.out.println("varMi 2. yontem= " + cumle.contains("Dunya")); // Dogru
        System.out.println("varMi 2. yontem= " + cumle.contains("dunya")); // Yanlis
    }
}
