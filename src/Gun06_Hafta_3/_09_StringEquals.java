package Gun06_Hafta_3;

public class _09_StringEquals {
    public static void main(String[] args) {
        // equals : 2 stringin bir birine esit olup olmadigina kontrol eder
        
        String s1 = "Merhaba";
        String s2 = "MERHABA";
        
        boolean esitMIi= s1.equals(s2); // s1 s2 ye esit mi?
        System.out.println("esitMIi = " + esitMIi);

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(\"Merhaba\") = " + s1.equals("Merhaba")); // s1 "Merhaba" ya esit mi evet esit cunku s1 = Merhaba ve yzilan Merhaba da s1 gibi ayni yailmis.

    }
}
