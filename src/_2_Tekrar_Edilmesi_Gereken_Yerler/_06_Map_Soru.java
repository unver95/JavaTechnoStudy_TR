// Canlı Sözlük yapılmak isteniyor.
// Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
// 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
// 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
// 3- Listeleme
// 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
// 5- Silme
// 6- Çıkış

package _2_Tekrar_Edilmesi_Gereken_Yerler;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_Map_Soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        Map<String, String> bos = new TreeMap<>();
        do {
            System.out.println(
                    "        1- Ekleme (Bu secekte kelimenin kendisi ve manasini bir cumle ile yaziniz)\n" +
                            "        2- Duzeltme (Bu secenkte kullanincinin kelimenin manasini duzelttiriniz.)\n" +
                            "        3- Listeleme\n" +
                            "        4- Arama (Bu secekte verilen bir kelimeyle baslatan tum kelimelerin manalari)\n" +
                            "        5- Silme\n" +
                            "        6- Cikis");
            System.out.print("Secim yapin: ");
            secim = input.nextInt();

            if (secim == 1) {
                bos = Ekleme();
            } else if (secim == 2) {
                bos = Duzeltme(bos);
            }
        } while (secim < 6);
    }

    public static Map<String, String> Ekleme() {
        Scanner input = new Scanner(System.in);
        String cumle, anlam;

        System.out.print("Kelime girin: ");
        cumle = input.nextLine();

        System.out.print("Kelimenin anlami yazin: ");
        anlam = input.nextLine();

        TreeMap<String, String> sirali = new TreeMap<>();
        sirali.put(cumle, anlam);

        return sirali;
    }
    public static Map<String, String> Duzeltme(Map<String, String> duzeltilecek) {
        Scanner input = new Scanner(System.in);
        String degisim;
        String anlam;

        System.out.println(duzeltilecek.keySet());
        System.out.print("Duzeltmek istedigin seyi yaz: ");
        degisim = input.nextLine();

        System.out.print("Yeni anlami nedir: ");
        anlam = input.nextLine();

        duzeltilecek.put(degisim, anlam);

        return duzeltilecek;

    }
}