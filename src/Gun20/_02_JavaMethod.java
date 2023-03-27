package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) { // Ana calisan kismin burasi, burdan digerlerini cagiracagiz.
        Math.max(5,6);  // Bi seyler gonderliliyor, geriye deger aliniyor.
        Math.random();  // Bi seyler gonderilmiyor, geriye deger aliniyor

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        merhabaYaz();   // Kullanimi kolay, cagirmasi kolay, tekrar tekrar kulanabilirsin
        merhabaYaz();   // Mainin daha kolay anlasilabilir olur
        merhabaYaz();   // Fonksiyonu cagirma sekli
    } // SirketMain bitisi

    public static void merhabaYaz(){
        System.out.println("Merhaba Dunyalilar");
        // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
        // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
        // temiz kod için
    }
}
