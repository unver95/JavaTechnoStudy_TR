package Gun06_Hafta_3;

public class _10_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // equalsIgnoreCase: equal la ayni calisir sadece buyuk kucuk harf fark etmez.

        String s1 = "Merhaba";
        String s2 = "MERHABA";

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // Burda buyuk kucuk harf hasasiyet
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // Burda kucuk buyuk harf hassas degil

    }
}
