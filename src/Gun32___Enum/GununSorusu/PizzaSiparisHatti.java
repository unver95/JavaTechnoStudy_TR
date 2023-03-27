package Gun32___Enum.GununSorusu;

// Bir pizza sipariş hattı yapılmak isteniyor.
// Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
// seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
// bir ARRAYLIST e atınız.
// Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
// verdiğini bir metodda yazdırınız.

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        int smallSayisi = 0;
        int mediumSayisi = 0;
        int largeSayisi = 0;

        ArrayList<Pizza> pizzaList = new ArrayList<>();

        do {
            menu();
            secim = input.nextInt();
            Pizza p = new Pizza();

            switch (secim) {
                case 1:
                    p.pizzaBoyut = PizzaBoyut.Small;
                    pizzaList.add(p);
                    smallSayisi++;
                    break;
                case 2:
                    p.pizzaBoyut = PizzaBoyut.Meduim;
                    pizzaList.add(p);
                    mediumSayisi++;
                    break;
                case 3:
                    p.pizzaBoyut = PizzaBoyut.Large;
                    pizzaList.add(p);
                    largeSayisi++;
                    break;
            }
        } while (0 < secim && secim < 4);

        for (Pizza a : pizzaList) {
            System.out.println(a.pizzaBoyut);
        }
        System.out.println("largeSayisi = " + largeSayisi);
        System.out.println("mediumSayisi = " + mediumSayisi);
        System.out.println("smallSayisi = " + smallSayisi);
    }


    public static void menu() {
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Goster");
        System.out.println("Secim yapin: ");
    }
}
