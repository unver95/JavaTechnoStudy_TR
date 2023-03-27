package Gun31_Hafta_8._2_FinalModifier.Ornek1;

import Gun31_Hafta_8._2_FinalModifier.Ornek1.Student;

public class Okul {
    public static void main(String[] args) {

        Student ogr1 = new Student("Ismet temur");
        Student ogr2 = new Student("Mehmet Yilmaz");
        Student ogr3 = new Student("Ayse Yildiz");

        System.out.println("ogr1: " + ogr1);
        System.out.println("ogr2: " + ogr2);
        System.out.println("ogr3: " + ogr3);



        //ogr1.okulNo=2; // yapabiliyorum : int okulNo böyleyken

        //private : erişimi engeller ama class dan erişebilirim.
        //final : değerin BIRKEZ atandıktan sonra değiştirilmesini engeller.
        //final değişkenlere değer ne zaman atılabilir ?
        // ilk tanımlandığı zaman veya CONSTRUCTOR da.

    }
}
