package _4_Kendimizin_Yaptigimiz_Kotlar;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame_V2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random mSayi = new Random();

        int makineTutugu;
        makineTutugu = mSayi.nextInt(0, 10 + 1);
        int guess = -1;
        int guessLimit = 3;
        boolean tahminDolduMu = false;

        for (int guessCount = 1; guessCount <= guessLimit; guessCount++) {
            if (guess != makineTutugu && !tahminDolduMu) {
                System.out.println("Bir daha tahmin et");
                guess = input.nextInt();
                if (guessLimit != guessCount) {
                    if (guess < makineTutugu) {
                        System.out.println("Daha yuksek yazin" + makineTutugu);
                    } else if (guess > makineTutugu) {
                        System.out.println("Daha dusuk girin" + makineTutugu);
                    }
                }
                if (guessCount == guessLimit) {
                    tahminDolduMu = true;
                }
            }
        }
        if (tahminDolduMu) {
            System.out.println("Yenildin " + makineTutugu);
        } else {
            System.out.println("GGWP anneye kufur yok " + makineTutugu);
        }
    }
}
