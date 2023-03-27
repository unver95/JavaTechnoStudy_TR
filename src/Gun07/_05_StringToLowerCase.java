package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: String kucuk harfe cevirir.

        String text = "Merhaba Dunya";

        System.out.println("Orgijnal hali: " + text); // Merhaba Dunya
        System.out.println(text.toLowerCase());

        System.out.println("text buyuk veya kucuk harf de olsa \"me\" ile basliyor mu ?"+
                                                                        text.toLowerCase().startsWith("me")); //true
                                                                    // Yukarisi icin yaziyoyrum: text.toLowerCase(). Once herseyi kucuk yapiyor ondans onra .startsWith("me") yapip var mi diye bakiyoruz "me" ama bu buyuk yazilmis olsaydi false olacakti ama toLowerCase yaptik diye bakmadan once hepsini kucultu.
                                                                    // Cevao true olacak cikti cunku "Me" "me" ye dondu ve text in icinde "me" var


    }
}
