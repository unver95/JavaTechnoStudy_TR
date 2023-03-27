package Gun40.Oracle_1;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A.Mesaj: " + A.mesaj);

        B b = new B(); // Burda degistirildi
        System.out.println("B.mesaj: " + B.mesaj);

        A a2 = new A();
        System.out.println("A.Mesaj: " + A.mesaj);

        System.out.println(A.mesaj);

    }
}

// Calisinca nasil bir cikti veririr
// Soru: Static Biliyormusun
// A.mesaj = A dan merhaba
// B.mesaj = B den merhaba
// A.mesaj = B den merhaba
