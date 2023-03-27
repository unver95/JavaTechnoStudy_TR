package Gun21_Hafta_6___Method_Return;

public class _02_Java_Method_Return {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        merhabaYaz();            // Giden yok, donen yok -> mutfakta bardaklari yikama.
        toplamYaz(4, 5);          // Giden ver, donen yok -> (fonksiyonu bir seye esitleyebilir musun).
        int enb = Math.max(4, 5); // Giden yok, donen var // mutfaktaki bardakleri yika, kac bardak yikadigini bana gel soyle

        /***************************************/
        enbYaz(4, 5);             // Giden var 4,5 ama donen yok

        int donen = enbBul(4, 5); // Giden var, donen de var
        System.out.println("donen: " + donen);
    }

    public static int enbBul(int sayi1, int sayi2) { // Donecek tip

        int donecek = 0;
        if (sayi1 > sayi2) {
            donecek = sayi1;
        } else {
            donecek = sayi2;
        }
        return donecek;           // Donecek olan degisken yaziliyor, fonksiyonun adindan onceye de donecek olan degiskenin tipi yazilir
    }

    public static void enbYaz(int sayi1, int sayi2){
        if (sayi1 > sayi2){
            System.out.println("sayi1 = " + sayi1);
        }else {
            System.out.println("sayi2 = " + sayi2);
        }
    }

    public static void toplamYaz(int sayi1, int sayi2){
        System.out.println(sayi1 + sayi2);
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
    }
}
