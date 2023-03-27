package Gun30.Soru;

public class Hesap {
    private int yatan;
    private int cekilen;
    private int bakiye;


    public int yatirilanPara(int yatir) {

        yatan += yatir;
        return yatan;
    }

    public int cekilenPara(int cek) {

        cekilen += cek;
        return cekilen;
    }

    public void bakiye() {
        bakiye = yatan - cekilen;
        System.out.println("Toplam bakiye: " + bakiye);
        System.out.println("Ceklilen: " + cekilen);
        System.out.println("Yatirilan:" + yatan);
    }
}
