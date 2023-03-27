package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner input = new Scanner(System.in);
        int numb1,numb2;




        System.out.print("Rakam girin: ");
        numb1 = input.nextInt();

        System.out.print("Bir daha rakam girin: ");
        numb2 = input.nextInt();

        System.out.println("Toplam =  T");
        System.out.println("Cikarma =  C");
        System.out.println("Carpma =  P");
        System.out.println("Bolme =  B");

        Scanner in = new Scanner(System.in);
        String islem = in.next();

        if(islem.equalsIgnoreCase("T"))
            System.out.println("Toplam" + (numb1 + numb2));
            else
                if (islem.equalsIgnoreCase("C"))
                    System.out.println("Cikarilmis hali= " + (numb1+numb2));
                else
                    if (islem.equalsIgnoreCase("P"))
                        System.out.println("Carpimi= " + (numb1*numb2));
                    else
                        if (islem.equalsIgnoreCase("B"))
                            System.out.println("Bolumu= " + (numb1/numb2));
                        else
                            System.out.println("Hatali secim" );
    }
}
