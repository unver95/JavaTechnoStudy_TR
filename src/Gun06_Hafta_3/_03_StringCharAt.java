package Gun06_Hafta_3;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // Istenen nokta daki karateri verir.
        // Karakterlerin sirasi 0(Sifir) dan baslar.
        // Buna index denir

        //              0123
        String cumle = "Merhaba Dunaya"; // M =0, e=1, r=2, h=3, a=4 falan filan diye gidiyor. (!!!!!Bosluklari da saymak lazim!!!!!)

        char ilkharf= cumle.charAt(0);
        System.out.println("ilkharf = " + ilkharf);

        System.out.println("\"3\" indexi " + cumle.charAt(3) + " dir"); // 3 deki karater




    }
}
