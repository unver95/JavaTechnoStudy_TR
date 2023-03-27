package Gun15;

public class _09_JavaNestLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****
        // ****
        // ***
        // **
        // *
        // *
        // **
        // ***
        // ****
        // *****

        for(int i = 5; i >1; i--){

            for(int j = 1; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
        for (int i = 1; i < 5; i++) {    // Kac satir (satir)

            for (int j = 0; j < i; j++)   // Siniri satir a bagladik yani usteki for a
                System.out.print("*");

            System.out.println();

        }
    }
}
