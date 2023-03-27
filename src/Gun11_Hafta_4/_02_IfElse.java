package Gun11_Hafta_4;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız
        Scanner input = new Scanner(System.in);
        int kacSaatKaldin;

        System.out.print("Kac saat kadlin: ");
        kacSaatKaldin = input.nextInt();

        if(kacSaatKaldin <=3){
            System.out.println("ucret 10 TL dir");
        }else { // 3 den kucuk DEGILSE
            if(kacSaatKaldin <=5){ // 5 Den kucuk degilse
                System.out.println("15 TL ode");
            }else {
                System.out.println("20 tl ode");
            }
        }
    }
}
