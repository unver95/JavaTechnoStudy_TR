package Gun06_Hafta_3;

import java.util.Scanner;
                                                    /*Gun 5 in ornekki*/
public class _01_Ornek {
    public static void main(String[] args) {
        Scanner yazi = new Scanner(System.in);
        Scanner rakam = new Scanner(System.in);

        String cadde, ulke;
        int postaKodu;

        System.out.println("Cadde: ");
        cadde = yazi.nextLine();

        System.out.println("Sokak kodu: ");
        postaKodu = rakam.nextInt();

        System.out.println("Ulke: ");
        ulke = yazi.nextLine();

        System.out.println("Adress: " + cadde +" "+ postaKodu +" "+ ulke);

    }
}
