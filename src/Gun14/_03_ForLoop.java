package Gun14;

import java.util.Scanner;

public class _03_ForLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.
        Scanner input = new Scanner(System.in);
        int numb;
        int toplam = 0;
        System.out.print("Sayi girin: ");
        numb = input.nextInt();

        for (; numb > 0; numb--) {
            toplam +=numb;
        }
        System.out.println(toplam);


        /*         Sena yolu (Dogru yol)       */
        System.out.println("bir sayi gir:");
        int x = input.nextInt();
        int toplam1 = 0;

        for (int i=0;i<x;i++){
            toplam1+=i;
        }
        System.out.println("toplam = " + toplam);
    }
}