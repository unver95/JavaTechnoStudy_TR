package Gun04;

public class _07_Ornek {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.

        String bagis1 = "500";
        String bagis2 = "1500";

        //int toplamBagis = bagis1 + bagis2; // String olduklari icin toplanamaz.

        System.out.println(bagis1 + bagis2); // yan yana yazar 2 ayri kelime gibi dusunup yapistirir birbirine yani 5001500 olur sonuc

        //String i int yapiyoruz burda
        int intBagis1 = Integer.parseInt(bagis1);
        int intBagis2  = Integer.parseInt(bagis2);

        // yaptigimiz 2 int i toparliyoruz.
        int toplamBagis = intBagis1 + intBagis2;

        System.out.println("Toplam: " + toplamBagis);


    }
}
