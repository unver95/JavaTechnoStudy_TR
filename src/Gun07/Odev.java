package Gun07;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /********************** 1.Soru ******************************/
        String text = "papper";

        System.out.println(text.toUpperCase());

        /********************** 2.Soru ******************************/
        String meyve = "OraGnE";

        System.out.println(meyve.toLowerCase());

        /********************** 3.Soru ******************************/
        String ny = "New Jersey";
        System.out.println(ny.toUpperCase());

        /********************** 4.Soru ******************************/
        String usa = "New York";
        System.out.println(usa.toLowerCase());

        /********************** 5.Soru ******************************/
        String text1 = "PADDLE";
        System.out.println(text1.toLowerCase());

        /********************** 6.Soru ******************************/
        String meyve2 = "apple";
        System.out.println(meyve2.contains("app"));

        /********************** Ozel soru 1  ******************************/
        Scanner input = new Scanner(System.in);

        String cumle;
        System.out.print("Istediginiz kadar bosluklu bir cumle yaziniz otomatik kac tane kelime oldgunu bulacaktir: ");
        cumle = input.nextLine();
        int boslukSayac = 0;
        for(int i =0; i < cumle.length(); i++){
            if(cumle.charAt(i) == ' ') {
                boslukSayac++;
            }
        }
        System.out.println(boslukSayac+1);
        /********************** Ozel soru 2  ******************************/
        String isimler;

        System.out.println("3 tane isim gir");
        isimler = input.nextLine();

        char ilkIsimK = isimler.charAt(0);
        int ilkBosluk = isimler.indexOf(" ");

        char ikinciIsimK = isimler.charAt(ilkBosluk+1);
        int ikinciBosluk = isimler.indexOf(" ", ilkBosluk+1);

        char ucuncuIsimK = isimler.charAt(ikinciBosluk+1);

        System.out.println(ilkIsimK + "." + ikinciIsimK + "." + ucuncuIsimK);
    }
}
