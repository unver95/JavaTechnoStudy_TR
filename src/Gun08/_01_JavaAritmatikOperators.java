package Gun08;

public class _01_JavaAritmatikOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        System.out.println("Toplama ISlemi");
        System.out.println("a+b = " + (a + b)); // Toplama

        System.out.println("Toplama ISlemi"); // Cikarma
        System.out.println("c+d = " + (a - b));

        System.out.println("Toplama ISlemi"); // Carpma
        System.out.println("a+b = " + (a * b));

        System.out.println("Toplama ISlemi"); // Bolme
        System.out.println("a+b = " + (a / b)); //sari olmasi nedeni sonuc int olarak cikacak uyariyor seni

        System.out.println("Toplama ISlemi");
        System.out.println("a+b = " + (a % b)); /* Kalani verir         4 % 5 =>4
                                                Modül (%)'de
                                                sol büyük ise kalanı al
                                                sol küçükse solundakini al
                                                */
        System.out.println("Toplama ISlemi");
        System.out.println("a+b = " + (b % a));                       //5 % 4 =>1




    }
}
