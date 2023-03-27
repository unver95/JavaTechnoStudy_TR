package Gun37_Interface.Soru6;

public class Dikdortgen implements ISekil {

    @Override
    public double cevresi(int kisaKenar, int uzunKenar) {
        return (kisaKenar + uzunKenar)*2;
    }

    @Override
    public double alan(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
