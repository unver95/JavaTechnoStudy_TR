package Gun10;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String isim;

        System.out.println("3 tane isim gir: ");
        isim = input.nextLine();

        char ilkKelime = isim.charAt(0);
        int ilkBosluk = isim.indexOf(" ");

        char ikinciKelime = isim.charAt(ilkBosluk+1);
        int ikiBosluk = isim.indexOf(" ", ilkBosluk +1);

        char ucunuKelime = isim.charAt(ikiBosluk+1);
        System.out.println(ilkKelime + "." + ikinciKelime + "." + ucunuKelime);
    }
}
