package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    Kisi(String ad, String soyad, String gorev){
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public void setAd(String ad){
        this.ad = ad;
    }
    public String getAd(){
        return this.ad;
    }

    public void setSoyad(String soyad){
        this.soyad = soyad;
    }
    public String getSoyad(){
        return this.soyad;
    }

    public void setGorev(String gorev){
        this.gorev = gorev;
    }
    public String getGorev(){
        return this.gorev;
    }


    public static void KimlikYazdirma(Kisi gelenKisi){
        System.out.println("Adi:" + gelenKisi.ad);
        System.out.println("Soyad: " + gelenKisi.soyad);
        System.out.println("Gorev: " + gelenKisi.gorev);

        if(gelenKisi instanceof Ogrenci){
            System.out.println("Subesi: " + ((Ogrenci)gelenKisi).getSube());
        }else if (gelenKisi instanceof Calisan){
            System.out.println("Departman: " + ((Calisan)gelenKisi).getDepartman());
        }
    }
}
