package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz.
        // cevre=a+a+a+a    alan =a*a
        int kenar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar sayisi girin: ");
        kenar = input.nextInt();

        int alan = kenar * 2;
        int cevre = kenar * 4;

        System.out.println("alan: " + alan);
        System.out.println("cevre: " + cevre);

        System.out.println();

        /*Yada*/
        System.out.println(kenar * kenar); //alan
        System.out.println(kenar + kenar + kenar + kenar); // cevre

        System.out.println();

        /*Yada*/
        System.out.println("Alan: " + (kenar * kenar)); //alan
        System.out.println("Cevre: " + (4 * kenar)); // cevre
    }
}
