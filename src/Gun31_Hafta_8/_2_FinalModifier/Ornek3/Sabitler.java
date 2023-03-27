package Gun31_Hafta_8._2_FinalModifier.Ornek3;

public class Sabitler {

    public final int birGundeKacSaat;
    public final int birSaateKacDk;
    public final int birDkKacSaniye;

    int sn = 0;

    public Sabitler(int gun, int saat, int dk) {

        this.birGundeKacSaat = 24;
        saat += gun * birGundeKacSaat;
        this.birSaateKacDk = 60;
        dk += saat * birSaateKacDk;
        this.birDkKacSaniye = 60;
        sn += dk*birDkKacSaniye;

        System.out.println("Toplam sn: " + sn);
    }

}
