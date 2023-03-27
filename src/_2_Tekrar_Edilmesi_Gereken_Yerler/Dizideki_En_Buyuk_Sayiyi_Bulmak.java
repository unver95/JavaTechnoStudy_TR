package _2_Tekrar_Edilmesi_Gereken_Yerler;

public class Dizideki_En_Buyuk_Sayiyi_Bulmak {
    public static void main(String[] args) {
        int[] items = {2, 7, 3, 5, 8, 9};
        int funny = items[0];
        for (int i = 0; i < items.length; i++) {
            if (items[i] > funny) {
                funny = items[i];
            }
        }
        System.out.print(funny);
    }
}
