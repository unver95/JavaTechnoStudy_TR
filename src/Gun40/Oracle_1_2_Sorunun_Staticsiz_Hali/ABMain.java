package Gun40.Oracle_1_2_Sorunun_Staticsiz_Hali;

public class ABMain {
    public static void main(String[] args) {


        A a = new A();
        System.out.println("A.Mesaj: " + a.mesaj);

        B b = new B(); // Burda degistirildi
        System.out.println("B.mesaj: " + b.mesaj);

        A a2 = new A();
        System.out.println("A.Mesaj: " + a2.mesaj);
    }
}


