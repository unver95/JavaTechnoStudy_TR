import java.util.Scanner;

public class delete {

    public static void main(String[] args) {

        int a= 1;
        int b =2;

        //System.out.println(a == b);

/*

        System.out.println("salaak"+a+b);
        System.out.println(("salaak"+a)+b*3);
        System.out.println(("salaak"+a)+(b+1));
        System.out.println("salak"+(a+b));
        System.out.println("salak"+(a+b)+1);
        System.out.println("salak"+((a+b)+1));

        // Girilen bir ad soyadi "Burak Unver" B.U. sekilde yazdiriniz.

        Scanner sc = new Scanner(System.in);
        String isimSoyIsim = sc.nextLine();

        char ilkHarf = isimSoyIsim.charAt(0); //p

        int bosluk = isimSoyIsim.indexOf(" "); // 6

        // int q = isimSoyIsim.charAt(bosluk); // ASCII deki bosluk degeri veriyor
        char ikinciHarf= isimSoyIsim.charAt(bosluk+1);


        System.out.println(ilkHarf + "." + ikinciHarf + ".");
*/



        // Girilen bir String de bosluk olup olmadigini bulunuz.

        Scanner qq = new Scanner(System.in);
        String aa = qq.nextLine();

        if(aa.contains(" ")){
            System.out.println("Bosluk var");
        }else {
            System.out.println("Bosluk yok");
        }

        if (aa.isEmpty()){
            System.out.println("Bir sey yazilmamis!");
        }else {
            System.out.println("Ici dolu");
        }


        String sena= "Burak beni cok ozlemis onu gormek gerek";
        String degisti = sena.replaceAll("[Burak beni cok ozlemis onu gormek gerek]","                   ");
        System.out.println(degisti);

        degisti = sena.replaceAll("[^a-z]","xxx");
        System.out.println(degisti);
    }
}
