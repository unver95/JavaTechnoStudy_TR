package Gun34___OOP_Inheritance._2Ornek2;

public class SuperHayvan {
    private String renk;
    private int kilo;
    private String cins;


    public void  HayvanSesi(){
        System.out.println("Hayvan sesi");
    }

    SuperHayvan(String renk, int kilo, String cins){
        setRenk(renk);
        setKilo(kilo);
        setCins(cins);
    }


    public void setRenk(String renk){
        this.renk = renk;
    }
    public String getRenk(){
        return this.renk;
    }

    public void setKilo(int kilo){
        this.kilo = kilo;
    }
    public int setKilo(){
        return this.kilo;
    }

    public void setCins(String cins){
        this.cins = cins;
    }
    public String getCins(){
        return this.cins;
    }
}
