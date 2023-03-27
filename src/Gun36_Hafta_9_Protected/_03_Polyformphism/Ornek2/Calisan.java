package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek2;

public class Calisan extends Kisi{

    private String departman;

    Calisan(String ad, String soyad, String gorev, String departman){
        super(ad, soyad, gorev);
        setDepartman(departman);
    }


    public void setDepartman(String departman){
        this.departman = departman;
    }
    public String getDepartman(){
        return this.departman;
    }
}
