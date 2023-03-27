package Gun14;

public class _05_ForLoop_Continue {
    public static void main(String[] args) {
        // 2 ler carpim tablosu,tablo olarak yazdiriniz.
        // 5 ile 7 arasini pass gecsin
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6
        //    2 x 4 = 8
        //    2 x 5 = 10
        //    2 x 6 = 12
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20

        for (int i = 1; i <= 10; i++) {

            if(i>=5 && i <=7) // 5 ile 7 arasindaysa
                continue;     // usteki yeri pass gececek
                              // Donguyu kirmaz, pas gecirir

            System.out.println("2 x " + i + "= " + (2*i));
        }

        //  Break:    Dongu kirar ve daha calistirmaz
        //  Continue: Calistiginda pas gecirir, donguyu kirmaz
    }
}
