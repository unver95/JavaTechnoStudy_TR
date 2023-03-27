package Gun31_Hafta_8._1_StaticModifier.Ornek2;

public class Student {
    int id;
    String name;
    String surName;
    static int sayac = 0;

    Student(String name, String surName) {
        sayac++;
        this.id += sayac;
        this.name = name;
        this.surName = surName;

    }

    @Override
    public String toString() {
        return "Ad: " + name + "surname: " + surName + "ID: " + id;
    }

}
