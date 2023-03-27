package Gun44._01_ZamanDigerIslemleri;

import java.time.LocalDate;
import java.time.LocalTime;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun = LocalDate.now();
        LocalDate dun = buGun.minusDays(1);

        LocalTime a = LocalTime.now();

        boolean sonraMi= buGun.isAfter(dun);    // bugun dun den sonra mi 
        System.out.println("sonraMi = " + sonraMi);
        
        boolean onceMi = buGun.isBefore(dun);   // bugun dun den once mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi = buGun.isEqual(dun);    // bugun dun e esit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYil = buGun.isLeapYear();  // bugun artik yil mi
        System.out.println("artikYil = " + artikYil);
    
    
    }




}
