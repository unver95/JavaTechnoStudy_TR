package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {

        double oran= 3.9;
        int sayi = 5;

        sayi = (int) oran;
        System.out.println("sayi = " + sayi);

        long genelToplama = 834276523;
        sayi=(int) genelToplama;
        System.out.println("sayi = " + sayi);

    }
}
