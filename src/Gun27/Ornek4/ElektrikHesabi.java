package Gun27.Ornek4;

public class ElektrikHesabi {
    int toplamtuketim = 0;
    double birimFiyat = 0.7;
    double fatura = 0;


    void tuketunEkle(int gelenTuketim) {
        toplamtuketim += gelenTuketim;
    }

    void toplamTuketimYaz() {
        System.out.println("toplamTuketim:" + toplamtuketim);
    }

    void faturaYaz(String musteriAdi) {
        double toplamTutar = toplamtuketim * birimFiyat;
        System.out.println("*****************************");
        System.out.println("MusteriAdi: " + musteriAdi);
        System.out.println("toplamtuketim = " + toplamtuketim);
        System.out.println("toplamTutar = " + Math.round(toplamTutar));
        System.out.println("*****************************");
    }


}
