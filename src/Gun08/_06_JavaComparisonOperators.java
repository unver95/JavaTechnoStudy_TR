package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {

        int a= 50;
        int b= 50;

        // = atama    == esit mi
        System.out.println("a b ye esit mi: " + (a==b));       // True
        System.out.println("a b ye esit degil mi: " + (a!=b)); // False

        System.out.println("a b den buyuk mi: " + (a>b));      // False
        System.out.println("a b den buyuk mi: " + (a<b));      // False

        System.out.println("a b den buyuk veya esit mi: " + (a>=b)); // True
        System.out.println("a b den kucuk veya esit mi: " + (a<=b)); // True
    }
}
