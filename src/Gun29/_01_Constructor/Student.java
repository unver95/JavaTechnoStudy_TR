package Gun29._01_Constructor;

public class Student {


    int id;
    String name; // this => Classin in kendisi
    String surName;
    int classrooml;


    Student() { //Constructor - yapici Metodlar
        System.out.println("Nesne olusturun");// Nesne olusturulurken yapmak istediklerin icin burayi kullan
    }


    Student(int id1, String name1, String surName1, int classrooml1) {
        this.id = id;        // this.id : class id si       ,    id: local degisken parametre
        this.name = name;
        this.surName = surName;
        this.classrooml = classrooml;
    }

    Student(int id, String name, String surName) {
        this(id, name, surName, 0);
        // this.id = id;
        // this.name=name;
        // this.surName=surName;
        // this.classroom=0;
    }

    Student(int id, String name) {
        this(id, name, "", 0);
    }
}
