package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        // Trim: Strining basindan veya sonunda ki bosluklari temizler

        String text = "                                           Merhaba Dunya                      ";

        System.out.println("Textin orginal hali:->" + text + "<-");          // ->                                            Merhaba Dunya                      <-
        System.out.println("Textin Trimin hali: ->" + text.trim() + "<-");   // ->Merhaba Dunya<-
    }
}
