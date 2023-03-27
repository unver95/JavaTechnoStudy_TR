package Gun07;

public class _03_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith: Bununla basliyor mu? (Case Sensetive)
        // Sonuc: True veya False.

        String text= "HCL Teknolij";

        System.out.println("HC ile basliyor mu: " + text.startsWith("HC")); // true
        System.out.println("hc ile basliyor mu: " + text.startsWith("hc")); // false
        System.out.println("Te ile basliyor mu: " + text.startsWith("Te")); // false
        System.out.println("a ile basliyor mu: " + text.startsWith("a"));   // false
        System.out.println();
    }
}
