package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase: string buyuk harfe cevirir.

        String text = "Merhaba Dunya";

        System.out.println("Orgijnal hali: " + text); // Merhaba Dunya.
        System.out.println("Text in buyuk harfi: " + text.toUpperCase());

        //Buyuk veya kucuk harf farketmezsizin "YA" ile bitiyor mu?

        System.out.println(text.toUpperCase().endsWith("YA"));
    }
}
