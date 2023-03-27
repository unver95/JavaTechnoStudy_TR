package Gun37_Interface.Soru6;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d = new Dikdortgen();
        System.out.println(d.alan(4,5));
        System.out.println(d.cevresi(4,5));

        Kare k = new Kare();
        System.out.println(k.alani(4));
        System.out.println(k.cevresi(4));

        Daire yuvarlak = new Daire();
        System.out.println(yuvarlak.cevresi(6));
        System.out.println(yuvarlak.alan(9));
    }
}
