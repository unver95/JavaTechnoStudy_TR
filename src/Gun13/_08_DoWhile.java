package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner input = new Scanner(System.in);
        String str;

        System.out.print("Bir sey yaz");
        str = input.nextLine();


/*        while (!str.equals('x')) {
                System.out.println("Program calisiyor");                <- Yanlis buraso
                System.out.print("Bir sey yaz");
                str = input.nextLine();
        }
        System.out.println("Error");*/

        do {
            System.out.print("Bir sey yaz: ");


        } while (str.equalsIgnoreCase("x"));
    }
}
