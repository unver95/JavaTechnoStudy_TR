package _2_Tekrar_Edilmesi_Gereken_Yerler;

import java.util.Scanner;

public class Birden_fazla_bosluklu_stringin_basharflerini_yazma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text;

        System.out.print("4 tane isim yaz bosluklu");
        text = input.nextLine();

        char birinci = text.charAt(0);                          // B
        int  birinciBosluk = text.indexOf(" ");

        char ikinci = text.charAt(birinciBosluk + 1);            // U
        int  ikinciBosluk = text.indexOf(" ", birinciBosluk+1); // ilk yer istedigim ikinci yerde nereden sonra bakacagim (" " <- bunu istiyorum birinciBosluktan sonra)

        char ucunu = text.charAt(ikinciBosluk+1);
        int ucuncuBosluk = text.indexOf(" ",ikinciBosluk + 1);

        char dorduncu = text.charAt(ucuncuBosluk+1);
        int dorduncuBosluk = text.indexOf(" ", ucuncuBosluk + 1);

        char besinci =  text.charAt(dorduncuBosluk +1);
        System.out.println(birinci + "." + ikinci + "." + ucunu + "." + dorduncu + "." + besinci);
    }
}
