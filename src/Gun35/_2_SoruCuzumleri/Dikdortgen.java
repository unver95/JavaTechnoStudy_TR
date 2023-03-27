package Gun35._2_SoruCuzumleri;

public class Dikdortgen extends Sekil {

    private int uzunKenar;
    private int kisaKenar;


    public Dikdortgen(int uzunKenar, int kisaKenar) {
        setUzunKenar(uzunKenar);
        setKisaKenar(kisaKenar);
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double alan() {
        return this.uzunKenar * this.kisaKenar;
    }

    public double cevre() {
        return 2 * (this.kisaKenar + this.uzunKenar);
    }
}
