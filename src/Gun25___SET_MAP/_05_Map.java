package Gun25___SET_MAP;

import java.util.HashMap;

public class _05_Map {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String, String> vKartVizit = new HashMap<>();
        vKartVizit.put("isim", "Volkan Altintas");
        vKartVizit.put("Email", "volkan@gmail.com");
        vKartVizit.put("adres", "Cekmekoy/Turkiye");
        vKartVizit.put("telefon", "05071344005");

        System.out.println("vKartVizit.get(isim) = " + vKartVizit.get("isim"));
        System.out.println("vKartVizit.get(telefon) = " + vKartVizit.get("telefon"));


        HashMap<String, String> bKartVizit = new HashMap<>();
        bKartVizit.put("isim", "burak unver");
        bKartVizit.put("Email", "unver@gmail.com");
        bKartVizit.put("adres", "Rotterdam/Hollanda");
        bKartVizit.put("telefon", "+316521452");


        //Kartvizitlerim diye bir defteri nasil tanimlardim.
        //Volkan in kartviziti
        //      Volkan nin        kartviziti
        HashMap<String, HashMap<String, String>> kartVizitlerim = new HashMap<>();
        kartVizitlerim.put("volkan", vKartVizit);
        kartVizitlerim.put("burak", bKartVizit);
        System.out.println();

        // volkanin kartvizitine nasil ulasirim
        System.out.println("kartVizitlerim.get(volkan) = " + kartVizitlerim.get("volkan"));

        // volkanin telefonuna nasil ulasirim
        System.out.println("volkan in telefonu = " + kartVizitlerim.get("volkan").get("telefon"));

        // Burakin adressi nasil ulasirim
        System.out.println("burak in adresi= " + kartVizitlerim.get("burak").get("adres"));


    }
}
