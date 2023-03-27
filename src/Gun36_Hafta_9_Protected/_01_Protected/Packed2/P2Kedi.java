package Gun36_Hafta_9_Protected._01_Protected.Packed2;

import Gun36_Hafta_9_Protected._01_Protected.Packed1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi) {
        super.ad =ad;
        super.cinsi = cinsi;
        //protected lara extra olarak extend yoluyla
        //diger paketerden erisilebilir
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
