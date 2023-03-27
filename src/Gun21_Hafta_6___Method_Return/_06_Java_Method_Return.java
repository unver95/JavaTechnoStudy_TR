package Gun21_Hafta_6___Method_Return;

public class _06_Java_Method_Return {
    public static void main(String[] args) {


        int s1 = 4;
        int s2 = 4;
        int s3 = 4;
        int s4 = 4;

        int sonuc1 = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);

        String ad = "Ismet";
        String soyad = "Temur";
        String tamAd = toplamBul(ad, soyad);
    }
    public static String toplamBul(String s1, String s2){
        return s1 +s2;
    }

    public static int toplamBul(int s1, int s2){
        return s1 + s2;
    }

    public static int toplamBul(int s1, int s2, int s3){
        return s1 + s2+ s3;
    }
}