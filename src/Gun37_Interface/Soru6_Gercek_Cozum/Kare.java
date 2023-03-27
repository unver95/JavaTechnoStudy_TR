package Gun37_Interface.Soru6_Gercek_Cozum;

public class Kare implements ISekil {

    @Override
    public double cevresi(int ... dizi){
        return (dizi[0]+dizi[0]*2);
    }
    @Override
    public double alan(int ... dizi){
        return dizi[0]+dizi[0];
    }
}
