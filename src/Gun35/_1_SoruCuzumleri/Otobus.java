package Gun35._1_SoruCuzumleri;

public class Otobus extends SuperArac{

    private int yolcuKapasitesi;
    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapasitesi){
        super(renk, motorHacmi,marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }



    public void setYolcuKapasitesi(int yolcuKapasitesi){
        this.yolcuKapasitesi= yolcuKapasitesi;
    }

    public int getYolcuKapasitesi(){
        return this.yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return super.toString() + " Otobus= " +
                "yolcuKapasitesi= " + " yolcuKapasitesu: " + yolcuKapasitesi;
    }
}
