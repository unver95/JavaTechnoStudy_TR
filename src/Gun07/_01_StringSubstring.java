package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
/*        // String belli bir bolumunu alma islemini yapar

        // Substring kullanarak sadece "haba" cikar
        //           0123456789........
        String s1 = "Merhaba arkadaslar";

        String parca1 = s1.substring(3,7); // 3 no lu indexten 7 no lu indexte kadar 7 dahil degil
        System.out.println("parca1 = " + parca1);

        // Substring kullanarak sadece "arkadas" cikar
        String parca2 = s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        // Substring kullanarak sadece "arkadaslar" cikar
        String parca3 = s1.substring(8); // verilenden baslar sonuna kadar
        System.out.println("parca3 = " + parca3);*/

        String test = "Merhaba Dunya";
        int bosluk = test.indexOf(" ");
        System.out.println(test.substring(0, bosluk+1));
    }
}
