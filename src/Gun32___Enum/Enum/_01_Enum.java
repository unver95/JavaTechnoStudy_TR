package Gun32___Enum.Enum;

public class _01_Enum {

    enum Aylar{
        Ocak, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;


        //Verilen ayin gun sayisi bulun
        switch (ay){

            case SUBAT:
                System.out.println("28"); break;
            case Ocak:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println("31");break;
            case NISAN:
            case EYLUL:
            case KASIM:
            case HAZIRAN:
                System.out.println("30");break;
        }
        if(ay == Aylar.MAYIS){
            System.out.println("Zam yapildi");
        }

        // Aylar ay = Aylar.MAYIS
        System.out.println("ay = " + ay);                       // toString
        System.out.println("ay.name() = " + ay.name());         // SIMGE olarak kullanilan kelimeyi
        System.out.println("ay.ordinal() = " + ay.ordinal());   // SIMGE nin indexini verir

        for (Aylar a : Aylar.values()) // Enum yapisindaki tum bilgileri alabiliriz
            System.out.println(a.name() + " - " + a.ordinal()); // indexi ve adi
    }
}
