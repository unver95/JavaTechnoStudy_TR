package _2_Tekrar_Edilmesi_Gereken_Yerler.ENCAPSULATION_RESTORANT;

public class Lahmacun implements IFood {

    @Override
    public void taste() {
        System.out.println("Mukemmel yeri pizza");
    }

    @Override
    public double ucret() {
        return 30;
    }

    public void dough(){
        System.out.println("Mayali hamur hazirlandi");
    }

    public void addMeat(){
        System.out.println("Ozel kiyma eklendi");
    }
    public void bake(){
        System.out.println("Odun atesinde pisirildi");
    }
}
