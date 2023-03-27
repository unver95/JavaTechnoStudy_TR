package _2_Tekrar_Edilmesi_Gereken_Yerler;

public class GereksizStringIntYokEtme {
    public static void main(String[] args) {


        String strRakamli = "Kedi97";


        String strRakamsiz;

        strRakamsiz = strRakamli.replaceAll("\\d", "");

        System.out.println(strRakamsiz);

    }
}
