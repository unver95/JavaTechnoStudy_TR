package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
        Scanner in = new Scanner(System.in);
        System.out.println("ay no: ");
        int ayNo = in.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;

            case 2:
                System.out.println("28");
                break;

            default:
                System.out.println("gecersiz ay no");
        }
    }
}
