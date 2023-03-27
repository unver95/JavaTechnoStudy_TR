package Gun28.Onrek2;

public class MyMath {

    static int getMin(int a, int b) {
        return Math.min(a, b);
    }

    static int getRandom(int maxSayi) {
        return (int) (Math.random() * maxSayi);
    }

    static int getRandom(int min, int max) {
        return ((int) (Math.random() * (max - min)) + min);
    }

    static int getRound(double sayi) {
        return (int) Math.round(sayi);
    }

}
