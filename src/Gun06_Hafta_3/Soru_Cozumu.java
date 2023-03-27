package Gun06_Hafta_3;

import java.util.Scanner;

public class Soru_Cozumu {
    public static void main(String[] args) {
/*1-) int ve String isteyerek 3 tane soru olustur

2-) Girilen string de String uzunluk bul

3-) Girilen string de ilk char i al

4-) Girilen bir stringin sadece son harfini yazdiriniz.

5-) Verilen karakter(ler)in string icindeki INDEX ini verin (Merhaba dunya da ki ha hangi indexte d hangi index te falan)

6-) Girilen bir ad soyadi "Ismet Temur" I.T sekilde yazdiriniz.

7-) Concat: Bir Stringi diger Stringe birlestiriyor. stringleri birlestir

8-) Contains: Bir stringin icerisinde karakter(lerin) var olup olmadigini boolean cinsinden soyle true veye false.

9-) equals : 2 stringin bir birine esit olup olmadigina kontrol eder

10-) equalsIgnoreCase: equal la ayni calisir sadece buyuk kucuk harf fark etmez.

11-) isEmpty: Bir stringin bos olup olmadigini boolean olarak verir.

12-) LastIndexOf ise: aramaya sonradan baslar.

13-) Soru: Girilen bir String de bosluk olup olmadigini bulunuz.*/



       /* char ilk = text.charAt(0);
        int bosluk1 = text.indexOf(" ");
        char ikinci = text.charAt(bosluk1+1);

        int bosluk2 = text.indexOf(" ", bosluk1+1);
        char ucuncu = text.charAt(bosluk2+1);

        int bosluk3 = text.indexOf(" ",bosluk2+1);
        char dorduncu = text.charAt(bosluk3+1);

        System.out.println(ilk + "." + ikinci + "." + ucuncu + "." + dorduncu);
*/

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