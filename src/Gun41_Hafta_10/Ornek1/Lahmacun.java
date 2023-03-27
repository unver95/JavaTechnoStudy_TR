package Gun41_Hafta_10.Ornek1;

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
