package Gun29._03_Constructor_GUNUN_SORUSU;

public class Banka {
    String ad;
    int subeSayisi;
    int kurulusYili;


    Banka(String ad, int subeSayisi, int kurulusYili) {
        this.ad = ad;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    Banka(String ad, int subeSayisi) {
        this(ad, subeSayisi, 0);
    }

    Banka(String ad) {
        this(ad, 0, 0);
    }

    public String toString() {
        return ad + " " + subeSayisi + " " + kurulusYili;
    }

}
