package Gun37_Interface.Soru6_Gercek_Cozum;

public class Dikdortgen implements ISekil {

    @Override
    public double cevresi(int ... dizi) {
        return (dizi[0] + dizi[1])*2;
    }

    @Override
    public double alan(int ... dizi) {
        return dizi[0]*dizi[1];
    }
}
