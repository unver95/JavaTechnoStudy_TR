package _2_Tekrar_Edilmesi_Gereken_Yerler;

import java.util.Scanner;

public class Cumlede_Kac_Tane_Kelime_Oldugunu_Bulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text12;
        System.out.print("Istediginiz kadar bosluklu bir cumle yaziniz otomatik kac tane kelime oldgunu bulacaktir: ");
        text12 = input.nextLine();
        int boslukSayac = 1;

        if (text12.trim().isEmpty()) {
            boslukSayac--;
        }
        for (int i = 0; i < text12.length(); i++) {
            if (text12.charAt(i) == ' ') {
                boslukSayac++;
            }
        }
        System.out.println(boslukSayac);

    }
}
