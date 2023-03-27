package Gun06_Hafta_3;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter(ler)in string icindeki INDEX ini verin
        
        String cumle = "Merhaba Dunya";

        System.out.println("cumle.indexOf(\"r\") = " + cumle.indexOf("r"));    // 2
        System.out.println("cumle.indexOf(\"ha\") = " + cumle.indexOf("ha"));  // 3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));        // 4 Burda ilk "a" yi verir
        System.out.println("cumle.indexOf(\"ny\") = " + cumle.indexOf("ny"));  // 10
        System.out.println("cumle.indexOf(\" \") = " + cumle.indexOf(" "));    // 7 Bosluk verir
        System.out.println("cumle.indexOf(\"A\") = " + cumle.indexOf("A"));    // -1 Case sensetive yani buyuk kucuk harflere dikkat et

        //Yanina rakam yazarsak FromIndex olur otomatik ve girdigin rakamadan sonra bulmaya baslar.
        System.out.println("cumle.indexOf(\"a\",5) = " + cumle.indexOf("a",5)); // 6 "a" yi aramaya 5 nolu index ten sonra baslar

    }
}
