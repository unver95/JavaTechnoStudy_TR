package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek1;

public class Hayvan {
    private String name;

    public Hayvan(String name) {
        setName(name);
    }

    public void ses()
    {
        System.out.println("ses cikardi");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}