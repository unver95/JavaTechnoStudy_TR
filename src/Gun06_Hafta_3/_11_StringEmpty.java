package Gun06_Hafta_3;

public class _11_StringEmpty {
    public static void main(String[] args) {
        // isEmpty: Bir stringin bos olup olmadigini boolean olarak verir.

        String s1 ="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // Ici bos degil o zaman false

        String s2= " ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // Ici bos o yuzden true

        String s3= "";
        System.out.println("s3.isEmpty() = " + s3.isEmpty()); // Ici bos degil o zaman false
/*Yukari ya bir daha bak orda yanlislik var*/
    }
}
