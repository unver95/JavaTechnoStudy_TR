package Gun45._02_ExeptionHandling;

public class _01_JavaRunTimeExeption {
    public static void main(String[] args) {

        System.out.println("Program calismaya basladi");
        String kelime = "";
        char ilkHarf = kelime.charAt(3);
        System.out.println("Program bitti");
        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

        //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        //çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.
    }
}
