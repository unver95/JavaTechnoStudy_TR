package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // Asagidaki goruntuyu veren programi yaziniz (yanlizca 1 yildiz ile yapniz)
        //*         1.Satirda 1 yildiz
        //**        2.Satirda 2 yildiz
        //***       3.Satirda 3 yildiz
        //****      4.Satirda 4 yildiz
        //*****     5.Satirda 5 yildiz

        for (int i = 1; i < 5; i++) {    // Kac satir (satir)

            for (int j = 0; j < i; j++)   // Siniri satir a bagladik yani usteki for a
                System.out.print("*");

            System.out.println();

        }
    }
}

