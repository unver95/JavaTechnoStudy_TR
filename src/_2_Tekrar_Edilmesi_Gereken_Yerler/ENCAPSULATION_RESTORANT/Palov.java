package _2_Tekrar_Edilmesi_Gereken_Yerler.ENCAPSULATION_RESTORANT;

public class Palov implements IFood {
    @Override
    public void taste() {
        System.out.println("Cocuklarin vaz gecilmezi");
    }

    @Override
    public double ucret() {
        return 20;
    }

    public void fry(){
        System.out.println("Pirin sehiriye kavruldu");
    }

    public void boil(){
        System.out.println("Kisik ateste pisirildi");
    }

}
