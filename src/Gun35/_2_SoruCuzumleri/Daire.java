package Gun35._2_SoruCuzumleri;

public class Daire extends Sekil {

    private int yariCap;


    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alan() {
        return Math.PI*this.yariCap*this.yariCap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yariCap;
    }

}
