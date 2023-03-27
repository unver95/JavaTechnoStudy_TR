package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olcak sekilde yazdiriniz, bosluklari yazmasin

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle girin");
        String cumle = input.nextLine();

        for(int i = 0; i < cumle.length(); i++) {

            if(cumle.charAt(i)==' ') {
                continue;
            }

            System.out.println(cumle.charAt(i));
        }
    }
}
