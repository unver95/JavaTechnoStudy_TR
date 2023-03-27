package Gun37_Interface.Soru3;

public class Geometri {
    public static void main(String[] args) {

        // Bir interface in birden fazla class tarafindan implemente edilmesi
        Cember c = new Cember();
        c.ciz();

        Dikdortgen d = new Dikdortgen();
        d.ciz();

        // Interface lerden nesne uretileme fakat referans tipi
        // olustrulabilir, bu bizi Polymorphism sagladi.
        ICizdirir c2 = new Cember();
        c2.ciz(); // direk olarak sadece Interface deki
        //ismi verilmus olanlar metodlara erisebilirsin


        cizdirme(c);
        cizdirme(d);
    }
    public static void cizdirme(ICizdirir iciz){
        iciz.ciz();
    }
}