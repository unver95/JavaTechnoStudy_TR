package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
                                                    // Degiskenler -> Variable


        int sayi;                     // int : tam sayi sakliyacak kadar havizida yer ayiriyor (RAM) ve onun adina sayi diyor
                                      // degiskenler adi sayi, tipi int, int: tam sayi tutar sadece.

        int saYi;                     //bir harf bile farkli olsa farkli degiskendir. Yani sayi ve saYi ayni degil iki farkli degisken (Variable) dir yani buyuk kucuk harf tamamen degiksendir.

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        sayi =5;                      // sayinin degeri 5 oldu.

        System.out.println("sayi");   // cift tirnak arasinda ki hersey ekrana direk yazilir
        // sonuc:
        // sayi (yazili sekilde string sekilde yani)

        System.out.println(sayi);     // degiskenin (Variable) adini direk yazarak DEGERINI yazar
        // sonuc:
        // 5

        System.out.println("sayi= " + sayi);
        // sonuc:
        // sonuc= 5


        sayi = 7; // sayinin degeri 7 oldu.


        int kisaKener = 5;
        int uzunKener = 7;

        int cevre = kisaKener + kisaKener + uzunKener + uzunKener;
        System.out.println("Cevre= "+cevre);
        // sonuc:
        // Cevre= 24
    }
}
