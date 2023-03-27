/*
1- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
2- Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.
3- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.




4- Girilen bir sayı

Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.

Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.




5- Girilen 3 sayıdan en küçük olanını bulunuz.




6-Girilen bir string


Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.

Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.

Aksi halde (else) "no money" yazdırın.




7
-

    Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.

Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

Eğer ortalama not >=90 =>not=A

Eğer ortalama not >= 70 ve<90 => not=B

Eğer ortalama not >=50 ve <70 =>not=C

Eğer ortalama not <50 =>note=F

Aşağıdaki örnek çıktıya bakın:

int Quiz_score: 80

int mid_term_score: 68

int Final_score: 90

print (Your grade is B)

          (Notunuz B'dir)

8- Girilen 2 basamaklı bir sayının tersi olan sayıyı bulunuz.
9- Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
*/

package Gun10;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        Scanner intInput = new Scanner(System.in);
        int sayi;
        /******************** 1. Soru *************************/

        System.out.print("1-) Bir sayi giriniz: ");
        sayi = intInput.nextInt();

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;

        if (birler % 2 != 0 && onlar % 2 != 0 && birler == onlar) {
            System.out.println("Hem tek hem esitir");
        } else {
            System.out.println("Degildir");
        }
        /******************** 2. Soru *************************/

        Scanner stringInput = new Scanner(System.in);

        String kelime;
        System.out.println("2-) Kelime gir: ");
        kelime = stringInput.nextLine();

        if (kelime.toUpperCase().contains("A") || kelime.contains(" ")) {
            System.out.println("Bu cumlede hem \"A\" var veya bosluk var ");
        } else {
            System.out.println("Bu cumlede hem \"A\" var veya bosluk yok");
        }
        /******************** 3. Soru *************************/

        int numb, ondalik;

        System.out.println("3-) sayi girin");
        numb = intInput.nextInt();

        System.out.println("sayi girin");
        ondalik = intInput.nextInt();

        String sHali = numb + "." + ondalik;
        double sonDurum;
        sonDurum = Double.parseDouble(sHali);

        System.out.println(sonDurum);
        /******************** 4. Soru *************************/

        int num;

        System.out.print("4-) Bir sayi girin: ");
        num = intInput.nextInt();


        if (num % 9 == 0 && num % 5 == 0) {
            System.out.println("Able to divide by 9 and 5");
        }
        if (num % 4 == 0 && num % 5 == 0) {
            System.out.println("Able to divide by 4 and 5");
        }
        /******************** 5. Soru *************************/

        int numb1, numb2, numb3;
        System.out.print("5-) Sayi girin: ");
        numb1 = intInput.nextInt();
        int enKucuk = numb1;

        System.out.print("Sayi girin: ");
        numb2 = intInput.nextInt();

        System.out.print("Sayi girin: ");
        numb3 = intInput.nextInt();

        if (numb2 < enKucuk) {
            enKucuk = numb2;
        }
        if (numb3 < enKucuk) {
            enKucuk = numb3;
        }
        System.out.println("En kucuk sayi: " + enKucuk);
        /******************** 6. Soru *************************/

        String doviz;

        System.out.print("6-) euro yada dollar sembol gir: ");
        doviz = stringInput.nextLine();

        if (doviz.contains("€")) {
            System.out.println("This is euro");
        } else if (doviz.contains("$")) {
            System.out.println("This is dollar");
        } else {
            System.out.println("no money");
        }
        /******************** 7. Soru *************************/
        double sinav, araSinav, finalSinav;

        System.out.print("7-) Sinav notu gir: ");
        sinav = intInput.nextInt();

        System.out.print("ara sinav notu gir: ");
        araSinav = intInput.nextInt();

        System.out.print("Final notu gir: ");
        finalSinav = intInput.nextInt();

        double ortalama = (sinav + araSinav + finalSinav) / 3;

        if (ortalama >= 90) {
            System.out.println("Not = A");
        } else if (ortalama >= 70 && ortalama < 90) {
            System.out.println("Not = B");
        } else if (ortalama >= 50 && ortalama < 70) {
            System.out.println("Not = C");
        } else{
            System.out.println("Not = F");
        }
        /******************** 8. Soru *************************/
        int no;

        System.out.println("8-) 2 basamakli sayi yazin: ");
        no = intInput.nextInt();

        int ones = no%10;
        int tens = no/10;

        System.out.println( ones+""+tens);
        /******************** 9. Soru *************************/

        int number;
        System.out.println("9-) 3 basamakli sayi yazin: ");
        number = intInput.nextInt();

        int ones1 = number%10;
        int tens1 = (number/10)%10;
        int hundereds1 = number/100;

        System.out.println(ones1 + "" + tens1 + "" + hundereds1);
    }
}
