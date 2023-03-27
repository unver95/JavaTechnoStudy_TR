package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //Verilen 2 sayinin esit olup olmadigini yazdiriniz.

        Scanner input = new Scanner(System.in);
        int numb1, numb2;

        System.out.println("Sayi yaz: ");
        numb1= input.nextInt();

        System.out.println("Sayi gir: ");
        numb2= input.nextInt();

        System.out.println(numb1 == numb2);
    }
}
