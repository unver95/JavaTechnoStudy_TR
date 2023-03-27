package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        /***** String sayiya cevirmek *****/

        //String ad = "Burak";
        String kelimeSayisi = "94"; // Su anda bu ayni ad gibi simge yani rakam degil.
                                    // Fakat rakam, sayi gorunumlu ise sayiyya donusturebilirim.

        int intDeger= Integer.parseInt(kelimeSayisi); // Sayi gorunumlu cumleyi, sayiya donusturdu (String den sayiya cevirir)
        System.out.println("intDeger = " + intDeger);
        //int toplam = intDeger+5;
        //System.out.println("toplam = " + toplam); // Istersek toplama da yapa biliriz

        byte byteDeger= Byte.parseByte(kelimeSayisi); // Sayi gorunumlu simgeyi, sayiya(Byte) donusturdu.
        System.out.println("byteDeger = " + byteDeger);

        System.out.println();
        /***** Sayilari String e cevirmek *****/

        //.toString() diye olur her zaman (herhalde)

        int sicaklik = 18;
        //Bugun hava sicakligi 18 derece;
        System.out.println("bugun hava sicakligi " + sicaklik + " derece. "); //Otomatik Stiringe e donustu

        System.out.println();

        String sicaklikKelimeHali = Integer.toString(sicaklik); // manuel ve bu toplanmaz cunku artik sayi degil bu bir kelime/yazi
                                                                // int toplam2 = sicaklikKelilimeHali +5; yapilamaz cunku artik string degil.
        System.out.println("Bugun hava sicakligi " + sicaklikKelimeHali + "derece");


    }
}
