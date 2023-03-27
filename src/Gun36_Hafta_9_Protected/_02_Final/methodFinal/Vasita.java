package Gun36_Hafta_9_Protected._02_Final.methodFinal;

public class Vasita {
    private String cinsi;

    public Vasita(String cinsi){
        this.cinsi = cinsi;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public final void VasitaOzelYazdir(){
        System.out.println("Ozel yazdirma metodu");
    }

    @Override
    public String toString() {
        return "Vasita{" +
                "cinsi='" + cinsi + '\'' +
                '}';
    }
}
