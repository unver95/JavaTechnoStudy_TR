package Gun21_Hafta_6___Method_Return;


import java.util.Scanner;
// Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar


// sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
/*  1-toplama
    2-çıkarma
    3-çarpma
    4-bolme
    5-Faktöryel
    6-Çıkış
   Bir işlem seçiniz */

public class _01_Java_Method {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secim;

        do {
            menu();
            secim = input.nextInt();


            if (secim < 5) {
                islemYap(secim);
            }
        }
        while (secim < 5);{
            System.out.print("Cikis Yaptiniz");
        }
    }







    public static void menu() {
        System.out.println(
                        "1-toplama \n " +
                        "2-Cikarma \n " +
                        "3-Carpma \n" +
                        "4-Bolme \n " +
                        "5-Cikis \n " +
                        "Seciminiz: ");
    }

    public static void islemYap(int secim) {
        int numb1, numb2;
        Scanner input = new Scanner(System.in);

        System.out.print("sayi girin: ");
        numb1 = input.nextInt();
        System.out.print("sayi girin: ");
        numb2 = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println((numb1 + numb2));
                break;
            case 2:
                System.out.println((numb1 - numb2));
                break;
            case 3:
                System.out.println((numb1 * numb2));
                break;
            case 4:
                System.out.println((numb1 / numb2));
                break;
        }
    }
    // TODO : 4 işlem kısmınıda ayrı bir fonksiyonda yapalım
    // TODO : menülere yeni bir seçenek olarak girilen sayıya kadar çarpımı veren faktörel i de ekleyelim
}
