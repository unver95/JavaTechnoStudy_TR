package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir ogrencinin notuna gore 50 den buyukse esit ise gectini
        // Kucuk ise gecemedi

        Scanner input = new Scanner(System.in);
        int not;

        System.out.println("Ogrenci notu girin:");
        not = input.nextInt();
//        if (not =>50){
//            System.out.println("Tebrikler gectiniz");   //hangi not girilirse girilsin kontrol eder
//        }
//        if (not <50 ){
//            System.out.println("Gecemediniz");          //hangi not girilirse girilsin kontrol eder yukari dak ki dogru olsa bile kontrol eder
//        }

        if (not >= 50){
            System.out.println("Tebrikler gectiniz");
        }else{
            System.out.println("Gecemediniz"); // Yukarsi dogru ise else hic bakmaz bu sekilde de de bolgisyar fazla zorlanmaz
        }
    }
}
