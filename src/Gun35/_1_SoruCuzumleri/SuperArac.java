package Gun35._1_SoruCuzumleri;

public class SuperArac {
    private String renk;
    private int motorHacmi;
    private String marka;

    SuperArac(String renk, int motorHacmi, String marka){
        setRenk(renk);
        setMotorHacmi(motorHacmi);
        setMotorHacmi(motorHacmi);
    }

    public void setRenk(String renk){
        this.renk = renk;
    }
    public String getRenk(){
        return this.renk;
    }

    public void setMotorHacmi(int motorHacmi){
        this.motorHacmi = motorHacmi;
    }
    public int getMotorHacmi(){
        return this.motorHacmi;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }
    public String getMarka (){
        return this.marka;
    }

    public String toString(){
        return "renk: " + renk + " motorHacmi: " + motorHacmi + " marka: " + marka;
    }

}
