package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek1;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("hav hav");
    }
    public void kokladi(){
        System.out.println("hhhh hhh");
    }
}
