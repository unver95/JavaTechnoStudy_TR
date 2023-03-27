package _2_Tekrar_Edilmesi_Gereken_Yerler.ENCAPSULATION_RESTORANT;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 20;
    }

    public void boil(){
        System.out.println("Kisik atesste kaynatiliyor");
    }

    public void eatTomorrow(){
        System.out.println("Bir gun sonra tuketilmesi gerek");
    }
}
