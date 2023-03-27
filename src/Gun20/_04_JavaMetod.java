package Gun20;

import java.util.Scanner;

public class _04_JavaMetod {
    public static void main(String[] args) {

        tekiMiCiftMi(55);
        tekiMiCiftMi(30);


        // Kullaninicidan bir sayi alarak tek mi cift mi yazdriniz.
        tekMiCiftMiOKu();
        tekMiCiftMiOKu();
        tekMiCiftMiOKu();
    }
    public static void  tekMiCiftMiOKu(){
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = oku.nextInt();
        tekiMiCiftMi(sayi);
    }
    public static void tekiMiCiftMi(int sayi) {

        if(sayi%2==0){
            System.out.println("Cift");
        }else {
            System.out.println("Tek");
        }
    }
}
