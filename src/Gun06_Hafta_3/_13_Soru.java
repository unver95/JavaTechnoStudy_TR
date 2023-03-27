package Gun06_Hafta_3;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        // Girilen bir String de bosluk olup olmadigini bulunuz.

        Scanner input = new Scanner(System.in);
        String cumle;

        System.out.print("Bir sey yaz: ");
        cumle = input.nextLine();

        System.out.println("cumle.isEmpty() = " + cumle.isEmpty());
    }
}
