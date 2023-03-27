package Gun39_Abstract.Ornek_2;

public class Geometry {
    public static void main(String[] args) {

        Dikdortgen d = new Dikdortgen(3,5);
        d.setName("Dikdortgen Sekil");
        System.out.println(d);


        Daire dr1 = new Daire(5);
        dr1.setName("Daire Sekli");
        System.out.println(dr1);

        Daire dr2 = new Daire(2);
        dr2.setName("Daire Sekli");
        System.out.println(dr2);
    }
}
