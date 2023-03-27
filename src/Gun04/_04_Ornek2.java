package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {

        /*
        Byte:  -128 ile 127
        Short:  -32768 ile 32767
        Integer (int):  -2³¹ ile 2³¹-1
        Long:  -2⁶³ ile 2⁶³-1
        Float: -3.410³⁸ ile 3.410³⁸
        Double:  -1.710³⁰⁸ ile 1.710³⁰⁸
        */

        // 1 tane double ve 1 tane short degisken tanimla
        // Deger atayiniz, sonra double degiskeni short degiskene cevirerek, butun degerlerini ekrana yazdir

        double oran = 3.2;
        short kisa = 2;

        System.out.println("Once kisa = " + kisa);
        kisa = (short)oran; // Deger sigabildigi icin tam sayi kismini alir, ama ondalikli kisim alinamaz
        System.out.println("Sonra kisa = " + kisa);

        oran = 30000000.2;
        kisa = (short)oran; // short en fazla 32767 degeri alabilir
        System.out.println("kisa = " + kisa);
        // Hem tam sayi kismi sigmiyor, hemde ondalikli kisim atilamiyor, tamamten deger kayboluyor.

    }
}
