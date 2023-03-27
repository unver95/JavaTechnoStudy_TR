package _3_Hocaya_Sorulacaklar;

import java.util.Scanner;

// TODO: 13/08/2022 Hocaya sor neden bi sure sonra - oluyor 
public class For_Dongusu_Eksi_Oluyor {
    public static void main(String[] args) {
        // Girilen bir sayıyı okutunuz ve bu sayıya kadar olan sayıların çarpımını bulunuz (Örneğin 5 girildi : 5,4,3,2,1 çarpım sonucu gibi)

        Scanner input = new Scanner(System.in);
        int sayi;
        //int sonuc =1;

        System.out.print("Sayi girin: ");
        sayi = input.nextInt();


        for (; sayi >=1; sayi--){
            sayi*=sayi;
            // 3 ==
            //say = say * sayi
            System.out.println(sayi);
        }
    }
}
