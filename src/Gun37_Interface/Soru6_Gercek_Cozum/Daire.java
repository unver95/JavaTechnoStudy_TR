package Gun37_Interface.Soru6_Gercek_Cozum;

public class Daire implements ISekil {


    public double cevresi(int ... dizi) {
        return 2*Math.PI*dizi[0];
    }


    public double alan(int ... dizi) {
        return Math.PI*(dizi[0]*dizi[0]);
    }
}
