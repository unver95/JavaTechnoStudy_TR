package _2_Tekrar_Edilmesi_Gereken_Yerler.Mike_Java_Quize;

import java.util.Scanner;

public class Quize {
    public static void main(String[] args) {

        String q1 = "What color are apples? \n"
                + "(a)red/green \n (b)Orange \n (c)Magenta\n";

        String q2 = "What color are banas? \n"
                + "(a)red/green \n (b)Yellow \n (c)Blue \n";

        Questions[] questions = {
                new Questions(q1, "a"),
                new Questions(q2, "b")
        };
        puanBulma(questions);
    }

    public static void puanBulma(Questions[] q) {
        int puan = 0;
        String kullanicininCevabi;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i].soru);
            kullanicininCevabi  = input.nextLine() ;

            if(q[i].cevap.equalsIgnoreCase(kullanicininCevabi)){
                puan++;
            }
        }
        System.out.println("Toplam puan: " + puan + "/" + q.length);
    }
}