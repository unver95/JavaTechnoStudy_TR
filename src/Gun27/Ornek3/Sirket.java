package Gun27.Ornek3;

// 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
// 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
// 3- Adım : Bu degerlerı yazıdırınız.
// 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
//           çalıştığında kişinin doğum yılını versin.
// 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
//           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D

public class Sirket {
    public static void main(String[] args) {
        Person personel1 = new Person();
        personel1.name = "Ayser";
        personel1.surname = "Yilmaz";
        personel1.age = 34;

        Person personel2 = new Person();
        personel2.name = "Sakir";
        personel2.surname = "Demir";
        personel2.age = 32;

        //1.Yontem ----> en iyi yontem 2. yontem
        {
System.out.println("1. Yontem");
            System.out.println("personel1.name = " + personel1.name);
            System.out.println("personel1.surname = " + personel1.surname);
            System.out.println("personel1.age = " + personel1.age);

            System.out.println("personel2.name = " + personel2.name);
            System.out.println("personel2.surname = " + personel2.surname);
            System.out.println("personel2.age = " + personel2.age);
System.out.println();
            System.out.println("*********************************");
System.out.println();
        }

        // 2. Yontem  -----> EN IYI YONTEM kendine ozel klas var
System.out.println("2. Yontem");
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

        System.out.println("Personel1 getBirthYear " + personel1.getBirthYear());
        System.out.println("Personel2 getBirthYear " + personel2.getBirthYear());
System.out.println();
        System.out.println("*********************************");
System.out.println();

        // 3. Yontem  -----> Metotda yapildi   en iyi yontem 2. yontem
        {
System.out.println("3. Yontem");
            m_bilgiYazdir(personel1);
            m_bilgiYazdir(personel2);

            System.out.println("Personel1: " + personel1.getInitials());
            System.out.println("Personel2: " + personel2.getInitials());
        }

    }

    public static void m_bilgiYazdir(Person p) {
        System.out.println("personel1.name = " + p.name);
        System.out.println("personel1.surname = " + p.surname);
        System.out.println("personel1.age = " + p.age);
    }  // ---> 3. yontemle yapildi o yzuden gereksiz


}