package Projeler._2_Proje_Alisveris;

import Projeler._2_Proje.exception.ItemNotFoundException;
import Projeler._2_Proje_Alisveris.database.Database;
import Projeler._2_Proje_Alisveris.entity.*;
import Projeler._2_Proje_Alisveris.enums.City;
import Projeler._2_Proje_Alisveris.enums.Color;

import java.util.Scanner;

// TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------
public class ApplicationRunner {
    public static void main(String[] args) throws ItemNotFoundException {

        // TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

        Scanner scan = new Scanner(System.in);
        Database database = new Database();

        // TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

        // Bu urunler magazada satilan ve database de kayitli urunlerdir...
        Item item1 = new Item(1,"Macbook", Color.BLACK,1500);
        Item item2 = new Item(2,"IPhone",Color.GREEN,1200);
        Item item3 = new Item(3,"Samsung",Color.RED,800);
        Item item4 = new Item(4,"Mouse",Color.BLACK,100);
        database.addItem(item1);
        database.addItem(item2);
        database.addItem(item3);
        database.addItem(item4);

        // TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

        // Yeni Musteri olusturalim...Musteri bilgilerini Scanner Class ile kullanicidan alalim...
        System.out.println("Alisveris yapabilmek icin kayit olusturmaniz gereklidir...");
        System.out.println("Lutfen adinizi girin : ");
        String firstName = scan.nextLine();

        System.out.println("Lutfen soyadinizi girin : ");
        String lastName = scan.nextLine();

        System.out.println("Adresinizi giriniz..:");
        String address = scan.nextLine();

        System.out.println("Yasadiginiz sehiri seciniz..:");
        for (int i = 0; i < City.values().length; i++) {
            System.out.println(City.values()[i]+" icin "+i);
        }
        int chosenCity = scan.nextInt();

        System.out.println("Zipcode..: ");
        String zipCode = scan.next();

        System.out.println("Lutfen kullanici adinizi belirleyin : ");
        String userName = scan.next();

        System.out.println("Lutfen sifrenizi belirleyin :");
        String password = scan.next();

        User currentUser = new User(firstName, lastName, userName, password, new Address(address, City.values()[chosenCity], zipCode));
        database.addUser(currentUser);
        System.out.println("Kayit islemi basari ile tamamlanmistir... Keyifli alisverisler dileriz...");

        Cart shoppingCart = new Cart();

        //TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

        boolean continueShopping = true;
        while(continueShopping){

            // Kullaniciya hangi urunu almak istedigini soralim...
            System.out.println("Lutfen urun seciminizi yaparak SEPET'e ekleyiniz...");
            System.out.println("---------------------------------------------------");

            // Database de bulunan urunleri alt alta listeleyelim...
            for (int i = 0; i < database.getAllItems().size(); i++) {
                System.out.println(database.getAllItems().get(i).getName()+" icin "+(i+1)+" yazip ENTER a basiniz");
            }

            // Kullanicinin sectigi urunun id sini 'chosenItemId' isimli bir degiskende tutalim...
            final int chosenItemId = scan.nextInt();
            final Item chosenItem = database.findItemById(chosenItemId);

            // Secilen urunden kac adet almak istedigini soralim...
            // Kullanicinin girdisini 'chosenItemCount' isimli bir degiskende tutalim...
            System.out.println("Secilen urun "+chosenItem.getName()+"'den kac adet satin almak istiyorsunuz?");
            final int chosenItemCount = scan.nextInt();

            // CartItem i alisveris sepetine ekleyelim - shoppingCart.addToCart() - methoduyla ekleyelim...
            shoppingCart.addToCart(new CartItem(chosenItem,chosenItemCount));
            System.out.println("Sepetinizde "+shoppingCart.getTotalCartCost()+" Euro degerinde urun bulunmaktadir...");

            // TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

            boolean isInputValid = true;
            while (isInputValid){
                System.out.println("Alisverisi tamamlamak icin 1 i, devam etmek icin 2'yi tuslayin");
                // Kullanicinin secimini 'userChoice' isimli bir degiskende tutalim...
                final int userChoice = scan.nextInt();

                switch (userChoice) {
                    case 1 : {
                        System.out.println("Odemeniz alinmistir...Bizi tercih ettiginiz icin tesekkur ederiz");
                        System.out.println("Urununuz '" + currentUser.getAddress().getDescription() + "' adresine kargolanacaktir.");
                        shoppingCart.emptyCart();
                        isInputValid = false;
                        continueShopping = false;
                        break;
                    }
                    case 2 : {
                        isInputValid = false;
                        break;
                    }
                    default : System.out.println("Gecerli bir secim yapmadiniz...");
                }
            }
        }
    }
    // TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------
}
