package Gun41_Hafta_10.Ornek1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<IFood> siparisler = new ArrayList<>();
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            Menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    IFood ak = new AdanaKebab();
                    siparisler.add(ak);
                    break;

                case 2:
                    Lahmacun l = new Lahmacun();
                    siparisler.add(l);
                    break;

                case 3:
                    Borsh b = new Borsh();
                    siparisler.add(b);
                    break;

                case 4:
                    Palov p = new Palov();
                    siparisler.add(p);
                    break;
            }

        } while (secim < 5);

        for(IFood f : siparisler){
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparisler Hazilarniyor. ");
        double toplamUcret = 0;
        for (IFood f : siparisler){
            TechnoKitchen.hazirla(f);
            toplamUcret+=f.ucret();
        }
        System.out.println("Toplam Ucret: " + toplamUcret);
    }

    public static void Menu() {
        System.out.println("\n ***Menu*** \n \n 1-Adana Kebap (55 TL)" +
                " \n 2-Lahmacun (33 TL) \n 3-Borsh (33 TL) " +
                "\n 4-Palov (44 TL) \n 5-Tamam" +
                "\n Secim yapiniz");
    }
}
