package Gun44._02_JavaVeriTipleri;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle = "";

        // +
        cumle = cumle + "Bugun ";
        cumle += "hava ";
        cumle += "Soguk ";

        System.out.println("cumle = " + cumle);
        System.out.println("yan yana hali: " + cumle.concat(" dun daha sicakti"));
        System.out.println("cumle: " + cumle);

        cumle = cumle.concat(" dun daha sicakti. ");
        System.out.println("cumle: " + cumle);


        System.out.println("\n*******************\n");


        /**** StringBuilder ****/
        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun "); // appen: atama gerektirmez, ekler
        cumle2.append("hava ");
        cumle2.append("guzel");

        System.out.println("cumle2 = " + cumle2);


        //*** String ekleme islemlerinde performans testi ***//
        //1.Yontem + ile ekleme
        long startTime = System.currentTimeMillis();

        String test1 = "";
        for (int i = 0; i < 10000; i++) {
            test1 += "Merhaba";
        }
        System.out.println("+ icin sure: " + (System.currentTimeMillis() - startTime) + " ms");

        //2.Yontem concat ile ekleme
        startTime = System.currentTimeMillis();

        String test2 = "";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat("Merhaba");
        }
        System.out.println("concat icin sure: " + (System.currentTimeMillis() - startTime) + " ms");

        //3.Yontem BBuilder ile ekleme
        startTime = System.currentTimeMillis();

        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            test3.append("Merhaba");
        }
        System.out.println("StringBuilder icin sure: " + (System.currentTimeMillis() - startTime) + " ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("\n*************\n");

        /**** StringBuilder i biraz daha iceleyelim ****/
        StringBuilder s = new StringBuilder();
        s.append("Bugun"); // tekrar kendini atama gerektirmez concat den farki.
        s.append(" hava");
        s.append(" guzel");
        System.out.println("s: " + s);

        System.out.println("uzunluk" + s.length());   // uzunluk bulma
        s.append(4);                                  // eklenen her seyi toString hali varsa cevirerek ekler
        System.out.println("s" + s);

        s.reverse();                                  // Stringi i tersine cevirir
        System.out.println("s: " + s);
        s.reverse();
        System.out.println("s = " + s);

        s.delete(0,5);                                // 0 dahil 5 haric indexe gore siler
        System.out.println("s = " + s);

        s.deleteCharAt(3);                      // sadece belirtilen indexteki karakteri siler
        System.out.println("s = " + s);

        s.insert(5, "kelime ");              // 5 nolu indexe araya kelime ekledi
        System.out.println("s = " + s);

        s = new StringBuilder("Bugun hava sicak");  // sifirlandi ve ilk deger atandi
        System.out.println("s = " + s);

        s.replace(3,8, "bu ");          // verilen araligi verilen ile degistir
        System.out.println("s = " + s);

        StringBuffer sBuffer = new StringBuffer(); //tamamen StringBuilder ile ayni
        // tek farki, paralel calisan yazilimlarda, StringBuffer kullanir.
    }
}

