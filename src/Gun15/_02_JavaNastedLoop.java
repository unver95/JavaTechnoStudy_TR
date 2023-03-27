package Gun15;

public class _02_JavaNastedLoop {
    public static void main(String[] args) {
        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        //            #####
        //            #####
        //            #####
        //            #####
        //            #####

        for (int i = 0; i < 5; i++) {       // Kac satir (satir)
            for (int j = 0; j < 15; j++) {
                System.out.print("#");       // Kac karakter (sutun)

            }
            System.out.println();        // Her satirdan sonra \n
        }
    }
}

