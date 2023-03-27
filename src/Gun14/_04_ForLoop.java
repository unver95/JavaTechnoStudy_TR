package Gun14;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayiya (dahil) kadar alan sayilarin carpimini bulunuz
        // 2. bolum rakamanin; degeri 100 u gectiginde islem sonlansin
        Scanner input = new Scanner(System.in);
        int sayi;
        int carpim =1;

        System.out.print("Sayi girin: ");
        sayi = input.nextInt();

        for(int i =1; i <= sayi; i++){
            carpim*=i;
            if(carpim >100) // donguyu kirar fakat yuzden fazla da ki ilk rakami alta yazar
                break;
        }
        System.out.println(carpim);
    }
}
