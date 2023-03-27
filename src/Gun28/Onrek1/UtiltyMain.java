package Gun28.Onrek1;

public class UtiltyMain {
    public static void main(String[] args) {


        //tip(class)    nesne(Object)
        myUtilty myUt = new myUtilty();
        String strSayi = myUt.getString(356);
        int sayi = myUt.getInt("345");
        // Bu metodlar Class a mii nesne ye mi ait
        // evet Nesne ye ait

        Math.random();  // Ben bunu direk nesne tanimlamadan
        // Kendi metdolarimi kullanmak istiyorum


        String strSayi2 = myUtilty.getString2(23);
        int say2 = myUtilty.getInt2("34");
        // Bu metodlar nesne olusturmaya ihtiyac duymayan
        // class a (tipe ait) ait metodlardir
        // tipe ait oldugu icin tip adiyla cagrilabilir
        Integer.parseInt("34"); //Bu metod tipe ait
        Integer rakam = 5;

        // Nesneyi ilgilendiren metdolari normal yaziyoruz Static koymuotuz
        // Nesneyi ilgilendirmeyen, Tipi(class) ilgilendiren
        // Metodlari STATIC ile yaziyoruz
    }
}