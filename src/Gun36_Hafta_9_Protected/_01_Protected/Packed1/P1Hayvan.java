package Gun36_Hafta_9_Protected._01_Protected.Packed1;

public class P1Hayvan {
    public String ad; // her paketten, her yerden ulasilir
    int yas;          // sadece kendi paketinden ulasilir.
    protected String cinsi; // default gibi calisir, extra bir durumda diger paketlerden erisilebilir
    private String renk; // sadece kendi class indan erisilebilir


}
