package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek1;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("miav");
    }
    public void mirladi(){
        System.out.println("mirrr mirrr");
    }
}
