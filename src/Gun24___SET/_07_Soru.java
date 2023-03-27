package Gun24___SET;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class _07_Soru {
    public static void main(String[] args) {
        // Soru : 20 dan  60 kadar olan random sayılarla 10 elemanlı normal(int) bir diziyi doldurunuz.
        // Sonrasında farklı olan rakamları , bir başka diziye atayınız.(aynı rakamlar atılmayacak)
        // 2.Aşama - bir başka diziye atma işlemini bu sefer SET ile yapınız.

        Random r = new Random();
        int makineTutugu;

        int [] dizi = new int[10];

        HashSet<Integer> setDizi = new HashSet<>();
        for (int i = 0; i < dizi.length; i++) {
            makineTutugu = r.nextInt(20, 60);
            dizi[i]=makineTutugu;
            setDizi.add(dizi[i]);
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println("Ayiklanmis sekil: " + setDizi);
    }
}
