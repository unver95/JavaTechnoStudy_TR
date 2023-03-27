package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner intInput = new Scanner(System.in);
        int sayi1, sayi2;

        Scanner strInput = new Scanner(System.in);
        String operator;

        System.out.println("Bir sayi griniz: ");
        sayi1 = intInput.nextInt();

        System.out.println("Bir sayi daha griniz: ");
        sayi2 = intInput.nextInt();

        System.out.println("Bir operator giriniz: ");
        operator = strInput.nextLine();

        switch (operator.toUpperCase()) {
            case "T":
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case "C":
                System.out.println("Cikarma " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Carpma: " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bolum: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatali operator");
                break;
        }
    }
}
