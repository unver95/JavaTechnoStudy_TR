package Gun34___OOP_Inheritance._2Ornek2;

public class Kedi extends SuperHayvan{

    Kedi(String renk, int kilo, String cins){
       super(renk, kilo, cins);
    }

    public void HayvanSesi(){
        System.out.println("miauw miauw");
    }
}
