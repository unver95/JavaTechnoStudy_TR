package Gun15;

// TODO Sena da SRC al burasi silindi bende sonra yanlis kayit oldu dogrusunu al
public class _04_JavaNastedLoop {
    public static void main(String[] args) {
        // Asagidaki goruntuyu veren programi yaziniz (yanlizca 1 yildiz ile yapniz)
        /*

         ****
         ***
         **
         *

         */

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int m = 4; m > i; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

