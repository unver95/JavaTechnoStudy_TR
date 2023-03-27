package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek2;

public class Ogrenci extends Kisi{

    private String sube;
    Ogrenci(String ad, String soyad, String gorev, String sube){
        super(ad, soyad, gorev);
        setSube(sube);
    }

    public void setSube(String sube){
        this.sube = sube;
    }
    public String getSube(){
        return this.sube;
    }
}
