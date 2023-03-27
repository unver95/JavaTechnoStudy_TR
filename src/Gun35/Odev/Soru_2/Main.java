package Gun35.Odev.Soru_2;

/*
2-

Burada iki adet class vardır. Biri Main diğeri ise Employees,

**Employees(Çalışanlar) class'ında;**

Bu variable'ları oluşturunuz;

private String name,

private int salary,

private String dob (date of birth) (Doğum tarihi)

getter ve setter oluşturunuz.

**Main class'ın içinde;**

_Örnek:_

_Name is Fernando_

_Salary is 80000_

_dob is 11/23/2000_

**main method'un içinde,**

Eğer employee 18 yaşında büyükse, **Welcome to our company Fernando your salary is 80000.** yazdırınız.

Eğer Fernando 18 yaşından küçükse, **come back when you are 18 years old.** yazdırınız.

Eğer Fernando 18 yaşındaysa,  **we can have intern with you after that you can have a 80000 salary** yazdırınız.

```
ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
```

*/

public class Main {
    public static void main(String[] args) {
        Employees em = new Employees("Ferlando", 80000, "11/23/2000");
        System.out.println("Name is " + em.getName());
        System.out.println("dob is " + em.getdob());
        System.out.println("Salary is " + em.getSalary());
        System.out.println();
        System.out.println(yasKontrol(ageCalculator(em.dogumYiliBulma())));
    }

    public static int ageCalculator(String yil) {
        int rakam = Integer.parseInt(yil);
        return 2022 - rakam;
    }

    public static String yasKontrol(int yas) {
        String cevap;

        if (yas < 18) {
            cevap = "Come back when you are 18 years old.";
        } else if (yas == 18) {
            cevap = "We can have intern with you after that you can have a 80000 salary.";
        } else {
            cevap = "Welcome to our company Fernando your salary is 80000";
        }
        return cevap;
    }
}
