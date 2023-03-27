package Printf;

public class _03_Printf {
    public static void main(String[] args) {

        int a =2343;
        double pi= 3.14321;
        String isim = "Burak";
        char basHarf = 'B';
        System.out.printf("%5d",a);  // a yi 5 hane icinde ondalik sistemde goster
        // Virgulden once ki bolum format
        // virgulden sonra ki bolum datalari temsil ediyor
        System.out.println("Merhaba");

        System.out.printf("%-5d",a); //sola dayali
        System.out.println("Merhaba");


        System.out.printf("%-5d %6.2f \n",a, pi); // %6.2f" 6 hane kullan noktadan sonra 2 habe kullan
        System.out.printf("%-5d %6.2f %20s", a, pi, isim);

        System.out.printf("%6.1f",pi);
        System.out.println("Merhaba");

        System.out.printf("%-6.1f",pi);
        System.out.println("Merhaba");

    }
}
