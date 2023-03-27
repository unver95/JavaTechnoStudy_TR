package Gun11_Hafta_4;

public class _08_JavaMathRandom {
    public static void main(String[] args) {
        // Soru: 0 ile 6(haric) arasinda random sayi uceten program yaziniz

        double doubleRandomSayi = Math.random(); // 0.0 - 0.999999 arasi sayi uretiyor

        //0 ile 6 arasinda random sayi
        int intRandomSayi = (int)(doubleRandomSayi *6); //0 - 5.999999 -(int) -> 0-5

        // direkt yontem
        System.out.println((int)(Math.random() * 6)); // 0- 5 arasi verir
    }
}
