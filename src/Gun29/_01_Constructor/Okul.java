package Gun29._01_Constructor;

//Bir Student sinifi olusturun
//(id(int), name surName, classroom(int)) ve
// bundan 3 adet ogrenci olusturun.

public class Okul {
    public static void main(String[] args) {

        //1.Yontem
        Student ogr1 = new Student(); // nesnenin olusturma ani
        // () bu bir metod isareti
        ogr1.id = 1;
        ogr1.name = "Ismeet";
        ogr1.surName = "temur";
        ogr1.classrooml = 11;
        System.out.println("ogr1.name = " + ogr1.name);

        //2.Yontem
        Student ogr2 = new Student(1, "Mehmet", "yilmaz", 11);

        System.out.println("ogr2.name = " + ogr2.name);

        Student ogr3 = new Student(3,"Hatice", "Demir");

    }
}
