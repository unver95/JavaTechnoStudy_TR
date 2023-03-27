package Gun36_Hafta_9_Protected._03_Polyformphism.Ornek1;

public class CiftlikMain {
    public static void main(String[] args) {
        /* Polymorphism -
                çok formluluk  - Çok çeşitlilik

        :  Bir NESNENIN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        ve bu şekilde kullanılabilmesine Polymorphism denir.*/

        Kedi k = new Kedi("sena");
//        k.ses();
//        k.mirladi();

        Kopek ko = new Kopek("Burak");
//        ko.ses();
//        ko.kokladi();

        kopekSesi(ko);
        kediSesi(k);

        hayvanSesi(k);
        hayvanSesi(ko);

//yihu


        /*********************************************/
        Hayvan hayvan1 = new Hayvan("ordek"); //hayvanlardan bir hayvan
        Hayvan hayvan2 = new Kopek("kangal"); //hayvanlardan bir kopek
        Hayvan hayvan3 = new Kedi("lara"); //hayvanlardan bir kedi
        //referans         nesne turu
        System.out.println("***************");
        hayvan1.ses(); //genel hayvan ses cikardi
        hayvan2.ses(); //kopek hav hav der
        hayvan3.ses(); //kedi miav der
        System.out.println("***************");



        hayvan2.ses();//kopek de olsa hayvan referansi sebebiyle methodlar kisitli
        //peki bu hayvanin kopek formunu nasil ortaya cikartirim
        //tip donusumu acaba isime yarar mi
        ((Kopek) hayvan2).kokladi(); //artik diger methodlari kullanabilirim


        //((int)Math.random()) casting burdaki gibi, tip donusumu
    }

    public static void kopekSesi(Kopek kopek) {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan) {
        hayvan.ses();
    }
}
