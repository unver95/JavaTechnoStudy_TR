package Gun06_Hafta_3;

public class _07_StringConcat {
    public static void main(String[] args) {
        // Concat: Bir Stringi diger Stringe birlestiriyor.
        
        String s1 = "Merhaba";
        String s2 = "Dunya";

        System.out.println("Birlesik hali: " + s1 + s2); // + Birlesmis hali
        System.out.println("Birlesik hali: " + s1.concat(s2)); //Birlesmis hali
        System.out.println("Birlesik hali: " + s1.concat(" ").concat(s2));
        System.out.println("Birlesik hali: " + s1.concat(" " + s2) );

        System.out.println("1 = " + 1);
        System.out.println("s2 = " + s2);
    }
}
