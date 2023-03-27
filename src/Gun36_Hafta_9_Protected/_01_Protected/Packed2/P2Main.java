package Gun36_Hafta_9_Protected._01_Protected.Packed2;

import Gun36_Hafta_9_Protected._01_Protected.Packed1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h = new P1Hayvan();
          h.ad = "karabas";
//        h.yas // default sadece kendi paketinden
//        h.cinsi // protected default gibi
//        h.renk // private sadece kedni classindan

        P2Kedi k = new P2Kedi("Kopuk", "scottish ");
        System.out.println("k: " + k);
    }
}
