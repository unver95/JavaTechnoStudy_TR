package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner input = new Scanner(System.in);
        String kelime;
        // 1-) Kisa yol
        System.out.println("Kelime giriniz: ");
        kelime = input.nextLine();

        if (kelime.length() > 10 && kelime.contains("study")) {
            System.out.println("Hem 10 dan uzun hemde icinde \"study\" ");
        } else {
            System.out.println("Hayir hayir");
        }

        // 2-) Uzun yol
        int uzunluk = kelime.length();
        boolean varMi = kelime.contains("study"); // true false

        if (uzunluk > 10 && varMi) {
            System.out.println("Evet");
        } else {
            System.out.println("Hayir");
        }

        // Illa kucuk "study" bulmak icin -> kelime.toLowerCase().contains("study") yapmak gerek
        System.out.println("Kelime giriniz: ");
        kelime = input.nextLine();

        if (kelime.length() > 10 && kelime.toLowerCase().contains("study")) {
            System.out.println("Hem 10 dan uzun hemde icinde \"study\" ");
        } else {
            System.out.println("Hayir hayir");

        }
    }
}
