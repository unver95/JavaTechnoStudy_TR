package Gun11_Hafta_4;

public class _06_JavaMath {
    public static void main(String[] args) {

        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri= " + Math.abs(a));              // 12 absolute mutlak
        System.out.println("a ve b den buyuk olani= " + Math.max(a, b));        // 4
        System.out.println("a ve b den kucuk olani= " + Math.min(a, b));        // -12
        System.out.println("b nin karakoku= " + Math.sqrt(b));                  // 2
        System.out.println("2 nin 3. kuvetti= (2 uzeri 3) " + Math.pow(2, 3));  // 8
        System.out.println("Round 3.1= " + Math.round(3.1));                    // 3
        System.out.println("round 3.5= " + Math.round(3.5));                    // 4

        System.out.println("ceil 3.1= " + Math.ceil(3.1));                      // Bu rakamdan buyuk en yakin tam sayi 4
        System.out.println("ceil 3.5= " + Math.ceil(3.5));                      // Bu rakamdan buyuk en yakin tam sayi 4
        System.out.println("floor 3.1= " + Math.floor(3.1));                    // Bu rakamdan kucuk en yakin tam sayi 3
        System.out.println("floor 3.5= " + Math.floor(3.5));                    // Bu rakamdan kucuk en yakin tam sayi 3
    }
}
