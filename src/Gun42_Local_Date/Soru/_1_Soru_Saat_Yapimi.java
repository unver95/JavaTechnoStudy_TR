package Gun42_Local_Date.Soru;

import Utility.MyFunc;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _1_Soru_Saat_Yapimi {
    public static void main(String[] args) {
        //canli digital saat yapin

        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");

        while (true){
            LocalTime saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.Bekle(1);
        }
    }
}
