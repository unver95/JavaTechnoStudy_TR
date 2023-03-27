package Gun37_Interface.Soru4;

public class A4 implements IGosterir, IYazdirir{
    // hem karasal jem uydu
    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");
    }
}
