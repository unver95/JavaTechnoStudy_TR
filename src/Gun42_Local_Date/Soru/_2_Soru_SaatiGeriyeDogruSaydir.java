package Gun42_Local_Date.Soru;

import Utility.MyFunc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class _2_Soru_SaatiGeriyeDogruSaydir {
    public static void main(String[] args) {
        // Alinan Saat geriye dogru 60 sn saydiriniz. hocanın cozumu

        LocalTime saat = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println("saat = " + saat.format(f));

        LocalTime saat2 = LocalTime.of(saat.getHour(), saat.getMinute(), 59);
        System.out.println("saat2 = " + saat2.format(f));

        int dakika = saat.getMinute();
        int saniye = saat.getSecond();
        int st = saat.getHour();
        for (int sn = saniye; sn >= 0; sn--) {
            saat2 = LocalTime.of(st, dakika, sn);
            System.out.print("\r" + saat2.format(f));
            MyFunc.Bekle(1);

            if (sn == 0) {
                dakika--;
                sn = 60;
            }
            if (dakika == -1) { //07:01:00
                st--;
                dakika = 59;
                sn = 60;
            }
        }


       /* benim cozum
       LocalTime tarih = LocalTime.of(18, 2,12);

        ArrayList<String> zamanMakinesi = new ArrayList<>();

        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("hh:mm:ss");



        for ( int i = 5 ; i > 0; i--){

            LocalTime saat = LocalTime.now();

            zamanMakinesi.add(saat.format(of1));
            MyFunc.Bekle(1);

        }
        System.out.println(zamanMakinesi);

        for (int i=zamanMakinesi.size()-1;i>=0;i--){
            System.out.print("\r"+zamanMakinesi.get(i));
            MyFunc.Bekle(1);
        }*/
    }
}