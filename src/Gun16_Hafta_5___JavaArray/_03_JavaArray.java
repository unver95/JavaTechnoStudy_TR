package Gun16_Hafta_5___JavaArray;

public class _03_JavaArray {
    public static void main(String[] args) {

        int[] dizi1 = new int[5]; // 0,1,2,3,4.
        int[] dizi2={6,77,56,7,88,99,1021,33}; // Hem uzunlugu ve degerkerubu verdun.

        System.out.println("dizi2.length = " + dizi2.length);

        String[] kelimeler = new String[5]; // 5 tane kelime saklayabilen bir dizi degikeni.
        boolean[] dizi3 = new boolean[5]; // 5 tane boolean saklayabilen bir dizi degiskeni.
        double[] oranlar = new double[5]; // 5 tane double cinsi deger saklabilen bir dizi.
        System.out.println();
        for (int i=0;i<dizi1.length; i++)
            System.out.println("dizi1[i] = " + dizi1[i]);//int[] default:0
        for (int i=0;i<dizi2.length; i++)
            System.out.println("dizi1[i] = " + dizi2[i]);//
        for (int i=0;i<kelimeler.length; i++)
            System.out.println("dizi3[i] = " + kelimeler[i]);//int[] null
        for (int i=0;i<dizi3.length; i++)
            System.out.println("dizi1[i] = " + dizi3[i]);//int[] false
        for (int i=0;i<oranlar.length; i++)
            System.out.println("dizi1[i] = " + oranlar[i]);//int[] 0.0

    }
}
