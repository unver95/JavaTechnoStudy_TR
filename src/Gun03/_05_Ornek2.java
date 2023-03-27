package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Ornek soru: yaricapi(r) verilen bir dairenin cevresini ve alanini bulunuz
        // alan= pi*r*r cevre = 2*pi*r "pi = 3.14"  r = 9;

        double pi = 3.14;
        double r =9;
        double cevre;
        double alan;

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Alan = " + alan + "\ncevre = " + cevre);



    }
}
