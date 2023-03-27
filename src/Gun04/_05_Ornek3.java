package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kisinin agirligini double, boyunu int olarak degerler veriniz
        // Ve bir satirda boyunuz ... ve kilonuz ... sekilde yazdiriniz
        // Vucut kitle indexini de bularak yazdiriniz (kg / boy*boy).

        double kilo = 99.9;
        int boy = 185;

        double kitleIndex= kilo / (boy * boy); //Widing genisletme yonunde
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("Boyunuz = " + boy + ",kilonuz " + kilo + "Kitle indexsiniz de " + kitleIndex);
        /************************************/

        int kitleIndex2 = (int)kilo /(boy*boy); //Narrowing daraltma yonunde // sifirdan kucuk oldugu icin sonuc sonuc 0 cikacak int 0.123 almaz yada 1.42 yapamaz sadece tam sayi yapar yada tam sayiya cevirir
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}
