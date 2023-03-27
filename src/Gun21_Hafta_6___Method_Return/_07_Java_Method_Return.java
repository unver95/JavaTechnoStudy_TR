package Gun21_Hafta_6___Method_Return;

public class _07_Java_Method_Return {
    public static void main(String[] args) {

    int s1=45;
    int s2=4;
    int s3=67;
    int s4=23;

    int sonuc1=toplam(s1,s2);
    int sonuc2=toplam(s1,s2,s3);
    int sonuc3=toplam(s1,s2,s3,s4);
    //hepsi ayni tip sadece miktarlari farkli
    //bu tip durumlar icin birkolaylik saglanmis
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);

}
    //gelen kac sayi kac tane olurs aolsun hepsini al dizi seklinde methoda al
    public static int toplam(int... sayilar){//kac sayi gelirse gelsin onlari dizi seklinealiyor
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        return toplam;
    }
    public static int toplam(int s1,int s2){
        return s1+s2;
    }
    public static int toplam(int s1,int s2,int s3){
        return s1+s2+s3;
    }
    public static int toplam(int s1,int s2,int s3,int s4){
        return s1+s2+s3+s4;
    }
}
