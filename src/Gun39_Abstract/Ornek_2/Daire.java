package Gun39_Abstract.Ornek_2;

public class Daire extends Sekil{

    private double yariCap;

    public Daire(double yariCap){
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yariCap;
    }
}
