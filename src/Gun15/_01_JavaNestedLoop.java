package Gun15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin carpim tablosunu sormustuk
        // 2x1 = 2
        // 2x2 = 4
        // ...

        // Bunu hepsini istiyoruz 1-10

        for(int i =1; i <=10; i++){
            for(int j =1; j<=10; j++){
                System.out.println(i + " * " + j +"= "+ (i*j));
            }
        }
    }
}
