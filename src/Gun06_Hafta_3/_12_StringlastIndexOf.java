package Gun06_Hafta_3;

public class _12_StringlastIndexOf {
    public static void main(String[] args) {
        // indexOf gibi calisiyor bu aramaya bastan baslar.
        // LastIndexOf ise: aramaya sonradan baslar.
        
        String s1 ="Merhaba";

        System.out.println("Bastan sona dogru \"a\" yi arar:= " + s1.indexOf("a")); // 4
        System.out.println("Sondan basa dogru \"a\" yi arar= " + s1.lastIndexOf("a")); // 6
        // index her zaman tek sadece arama yonu degisir.(Demek istiyor ki index "a" yeri degismez)


    }
}
