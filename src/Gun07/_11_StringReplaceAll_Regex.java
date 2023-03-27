package Gun07;

public class _11_StringReplaceAll_Regex {
    public static void main(String[] args) {
        //ReplaceAll: replace gibi calisiyor. Farki kriter(regex) verilebilir
        //regex: Regular expression / duzenli ifade.
        // Case Sensetive ****************************
        // TODO (yapilacaklar) : regex olarak neler yazilabiliyor google dan arastirilacak

        String text = "Merhaba Dunya123";

        System.out.println("text = " + text); //Orginal hali

        System.out.println("text.replaceAll(\"abn\" -> \"_\") = " + text.replaceAll("[abn]", "_")); // abm yi _ yap = Merh___Du_y_123
        System.out.println("text.replaceAll(A dan Z ye kadar hepsini degistirdi = " + text.replaceAll("[A-Z]", "_")); // A dan Z ye hepsi _ olur = _erhaba _unya
        System.out.println("0-9 -> = " + text.replaceAll("[^0-9]", "")); // Tum sayilari siler = Merhaba Dunya
    }
}