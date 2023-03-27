package Gun31_Hafta_8._1_StaticModifier.Ornek2;



public class School {
    public static void main(String[] args) {
        // Student (id, name, surName)
        // Yukarıdaki gibi 5 öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
        // Ve en son kaç öğrenci olduğunu bulabilmeliyim.
    //TODO: burada 1 fazla ogrenci gosteriyor -1 yapmadan nasil cozerdiniz

        Student ogr1 = new Student("Neeko ", "Eeko");
        Student ogr2 = new Student("Burak ", "Unver");
        Student ogr3 = new Student("Senna ", "Akbas ");
        Student ogr4 = new Student("panda ", "panda ");


        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr4);


        System.out.println(Student.sayac);
    }
}