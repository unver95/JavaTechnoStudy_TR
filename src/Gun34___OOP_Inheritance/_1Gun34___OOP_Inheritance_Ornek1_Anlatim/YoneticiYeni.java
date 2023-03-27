package Gun34___OOP_Inheritance._1Gun34___OOP_Inheritance_Ornek1_Anlatim;

public class YoneticiYeni extends Personel {


    private double yoneticiTazminati;

    public void zamYap(){
        System.out.println("zam yapildi");
    }

    public double getYoneticiTazminati() {
        return yoneticiTazminati;
    }

    public void setYoneticiTazminati(double yoneticiTazminati) {
        this.yoneticiTazminati = yoneticiTazminati;
    }
}

