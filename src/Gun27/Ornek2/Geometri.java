package Gun27.Ornek2;

public class Geometri {
    public static void main(String[] args) {

        Dikdortgen sekil = new Dikdortgen();
        sekil.kisaKenar = 5;
        sekil.uzunKenar =10;

        int alani = sekil.alan();
        int cevresi = sekil.cevre();

        System.out.println("cevresi = " + sekil.cevre());
        System.out.println("alan= " + sekil.alan() );
    }
}
