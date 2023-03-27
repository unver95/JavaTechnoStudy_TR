package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Kullanicinin girdigi sayiyi gune cevir
        Scanner input = new Scanner(System.in);
        int gunNo;

        System.out.print("Gun no: ");
        gunNo = input.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Pazateresi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatali Numara");
                break; // Yazmaya gerek yok cunku altinda daha baska bir sey yok.
        }
    }
}
