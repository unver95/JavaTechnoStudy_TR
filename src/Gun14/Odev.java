/*1-

# 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.

_Not: 0 ve 100 dahildir._




2-

# 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.

`Sonuç bu şekilde olmalıdır.`

```
0
20
40
60
80
100
```



özel sorular
3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz

6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuzç

7-Kullanıcından 10 sayı isteyiniz, ve ekrana yazdırınız,  eğer sonra girilen sayı önce girilenden büyük ise dikkate almasın(pass geçsin).
*/
package Gun14;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /**************** 1. Soru ****************/

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /**************** 2. Soru ****************/

        for (int j = 0; j < 100; j++) {
            if (j % 5 == 0 && j % 4 == 0) {
                System.out.println(j);
            }
        }

        /**************** 1.Ozel soru ****************/

        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        for (int l = 1; l <= 10; l++) {
            System.out.print("Sayi gir: ");
            sayi = input.nextInt();
            if (sayi % 2 == 0) {
                toplam += sayi;
            } else if (sayi % 2 == 1) {

                break;
            }
        }
        System.out.println("Toplam: " + toplam);

        /**************** 2.Ozel soru ****************/
        int numb;
        int sayac = 0;
        System.out.print("Sayi gir: ");
        numb = input.nextInt();

        while (numb > 0) {
            numb /= 10;
            sayac++;
        }
        System.out.println(sayac);

        /**************** 3.Ozel soru ****************/
        int sayi2;
        System.out.println("sayi gir");
        sayi2 = input.nextInt();

        int sonBasamak = sayi2 % 10;
        int ilkBasamak = 0;

        while (sayi2 > 0) {
            ilkBasamak = sayi2 % 10;
            sayi2 /= 10;
        }
        System.out.println("ilkBasamak = " + ilkBasamak);
        System.out.println("sonBasamak = " + sonBasamak);

        /**************** 4.Ozel soru ****************/
        System.out.print("Tersten yazmak icin sayi girin: ");
        int sena = input.nextInt();
        while (sena > 0) {
            int bas = sena % 10;
            System.out.print(bas);
            sena /= 10;
        }
        System.out.println();
        /**************** 5.Ozel soru ****************/
        int numb5;
        int enBuyuk = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("sayi gir: ");
            numb5 = input.nextInt();

            if (numb5 > enBuyuk) {
                continue;
            }
            enBuyuk = numb5;
            System.out.println("Yazdıgın sayi: " + numb5);
        }
    }
}