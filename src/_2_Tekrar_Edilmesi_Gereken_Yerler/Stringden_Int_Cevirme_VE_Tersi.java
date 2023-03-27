package _2_Tekrar_Edilmesi_Gereken_Yerler;

public class Stringden_Int_Cevirme_VE_Tersi {
    public static void main(String[] args) {

        /*String den  inte cevirme*/
        String yas = "18";
        
        int rakam = Integer.parseInt(yas);
        System.out.println("rakam = " + rakam);

        /*int den Stringe cevirme*/
        int numb = 123;

        String yazi = Integer.toString(numb);
        System.out.println("numb = " + yazi);
       /***************************************************************************************************************/
    }
}
