package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve cift eleman sayilari bulunuz.

        int[] sayi = new int[100];
        int cift = 0;
        int tek = 0;

        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < sayi.length; i++) {
            System.out.println(i + ". kutu sayisi  " + sayi[i]);
        }


        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] % 2 == 0) {
                cift++;
            } else {
                tek++;
            }
        }
        System.out.println("Tek: " + tek + "\n" + "Cift: " + cift);
    }
}
