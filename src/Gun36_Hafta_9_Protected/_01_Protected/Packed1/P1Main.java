package Gun36_Hafta_9_Protected._01_Protected.Packed1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan h =new P1Hayvan();
        h.ad = "karakedi";
        h.yas = 2;
        h.cinsi = "tekir"; //P1Hayvanla ayni pakette oldugu icin Extendet la cagirmaya gerek yok
        // h.renk private sadecee kendi classindan cagirlip kullanilir.
    }
}
