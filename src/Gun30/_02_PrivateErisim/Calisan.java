package Gun30._02_PrivateErisim;

public class Calisan {

    int id;
    String name;
    String surname;
    private String passWord;

    public void sifreAta(String sifre)
    {
        if (sifre.length()>=8){
            this.passWord=sifre;
            System.out.println("sifre basariyla atandi");
        }
        else
            System.out.println("sifre kurala uygun degil");
    }
    public void sifreGoster()
    {
        System.out.println("****"+passWord.substring(4));
    }
}
