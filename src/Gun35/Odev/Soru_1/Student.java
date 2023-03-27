package Gun35.Odev.Soru_1;


public class Student {
    private String isim;
    private int age;


    Student(String isim, int age){
        setIsim(isim);
        setAge(age);
    }

    public Student() {

    }

    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getIsim(){
        return this.isim;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return  "Student name is: " + this.isim + "He is: " + this.age + " years old";
    }

}
