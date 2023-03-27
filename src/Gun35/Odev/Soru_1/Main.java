package Gun35.Odev.Soru_1;

/*
-1- Burada iki adet class vardır. Biri **Main**, diğeri ise **student ,**

**student classı içinde;**

String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.

getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.

**Main classın içinde**;

Örnek:

**age 12**'dir.

**name Steven**'dır.

name(isim) olarak;

**"Student name is Steven"**

ve

age(yaş) olarak da;

"He is 12 years old"
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student stu = new Student("Senna", 69);

        System.out.println(stu);

    }
}
