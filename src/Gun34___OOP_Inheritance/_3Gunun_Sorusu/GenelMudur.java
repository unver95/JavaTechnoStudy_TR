package Gun34___OOP_Inheritance._3Gunun_Sorusu;



public class GenelMudur extends Calisan{
    private int tazminat;

    GenelMudur(String isim, int maas, int maasKatSayisi, int tazminat){
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }


    public void setTazminat(int taz){
        this.tazminat = taz;
    }
    public int getTazminat(){
        return this.tazminat;
    }

    public int MaasHesaplama(){
        return super.MaasHesaplama()+tazminat;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + getIsim() + '\'' +
                ", tazminat=" + tazminat +
                ", maas=" + super.getMaas() +
                ", maasKatSayisi=" + super.getMaasKatSayisi() +
                '}';
    }
}
