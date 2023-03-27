package Gun40.Oracle_2;

class C {
    public C() {
        System.out.println("C ");
    }
}

class B extends C {
    public B() {
        System.out.println("B ");
    }
}

class A extends B {
    public A() {
        System.out.println("A ");
    }
}

public class Ornek {
    public static void main(String[] args) {
        A a = new A(); // main calistirilnca ciktisi ne olur
    }
}
