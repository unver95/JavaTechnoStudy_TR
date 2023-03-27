package Projeler._3_Proje_Alisveris_V2.service;


import Projeler._3_Proje_Alisveris_V2.database.Database;
import Projeler._3_Proje_Alisveris_V2.entity.Address;
import Projeler._3_Proje_Alisveris_V2.entity.User;
import Projeler._3_Proje_Alisveris_V2.enums.City;
import Projeler._3_Proje_Alisveris_V2.exception.UserNotFoundException;

import java.util.List;

public class UserServiceImpl extends AbstractService implements UserService {

    int randomId = (int) (Math.random() * 100);

    @Override
    public List<User> getAllUser() {
        return Database.users;
    }

    // getUserById methodu parametre olarak aldigi 'id' ile Database de boyle bir user var mi diye kontrol eder,
    // yoksa, UserNotFound exception firlatir, varsa ilgili user i return eder...
    @Override
    public User getUserById(int id) throws UserNotFoundException {
        for (User parcala : Database.users) {
            if (parcala.getId() == id) {
                return parcala;
            }
        }
        throw new UserNotFoundException("User not found");
    }


    // addUser methodu, ApplicationRunner Class inda kullaniciya sorarak olusturdugumuz tum User olusturma kodunu bunyesinde
    // barindirir... Bunun icin Scanner a ihtiyac duyar ve bu Scanner'i Abstract Service i extend ederek oradaki Scanneri kullanir
    // User icin 'id' belirlenirken yukaridaki 'randomid' degiskenini kullanir...
    // Kullanici olusturulduktan sonra Database deki users listesine ekler..Son olarak o useri return eder...
    @Override
    public User addUser() {

        System.out.println("Alisveris yapabilmek icin kayit olusturmaniz gereklidir...");
        System.out.println("Lutfen adinizi girin : ");
        String firstName = scan.nextLine();

        System.out.println("Lutfen soyadinizi girin : ");
        String lastName = scan.nextLine();

        System.out.println("Adresinizi giriniz..:");
        String address = scan.nextLine();

        System.out.println("Yasadiginiz sehiri seciniz..:");
        for (int i = 0; i < City.values().length; i++) {
            System.out.println(City.values()[i] + " icin " + i);
        }
        int chosenCity = scan.nextInt();

        System.out.println("Zipcode..: ");
        String zipCode = scan.next();

        System.out.println("Lutfen kullanici adinizi belirleyin : ");
        String userName = scan.next();

        System.out.println("Lutfen sifrenizi belirleyin :");
        String password = scan.next();

        User currentUser = new User(randomId, firstName, lastName, userName, password, new Address(address, City.values()[chosenCity], zipCode));
        Database.users.add(currentUser);
        System.out.println("Kayit islemi basari ile tamamlanmistir... Keyifli alisverisler dileriz...");

        return currentUser;
    }


    @Override
    public void deleteUserById(int id) throws UserNotFoundException {
        for (User parcala : Database.users) {
            if (parcala == Database.users) {
                Database.users.remove(parcala);
            }
        }
        throw new UserNotFoundException("Kullanici bulunamadi..");
    }

    // updateUser methodu parametre olarak aldigi User i Database de arar, yoksa UserNotFound exception firlatir,
    // Varsa Datalase deki users listesinden silip, guncel halini Database users List ine ekler...
    @Override
    public void updateUser(User user) {

        for (User parcala : Database.users) {
            if (parcala == Database.users) {
                Database.users.remove(parcala);
            }else new UserNotFoundException("Kullanici bulunamadi..");
        }
    }

    // UserService icerisinde tanilanmis govdesiz tum methodlarin implementation unu bu class da yapacaksiniz...
    // Class ismindeki KIRMIZI ikaza giderseniz 'implement mothods' secenegini goreceksiniz... Onu secin ve baslayin...


    // GetAllUsers methodu Database e gidip oradan butun user lari alir ve bir List olarak return eder...


    // getUserById methodu parametre olarak aldigi 'id' ile Database de boyle bir user var mi diye kontrol eder,
    // yoksa, UserNotFound exception firlatir, varsa ilgili user i return eder...


    // addUser methodu, ApplicationRunner Class inda kullaniciya sorarak olusturdugumuz tum User olusturma kodunu bunyesinde
    // barindirir... Bunun icin Scanner a ihtiyac duyar ve bu Scanner'i Abstract Service i extend ederek oradaki Scanneri kullanir
    // User icin 'id' belirlenirken yukaridaki 'randomid' degiskenini kullanir...
    // Kullanici olusturulduktan sonra Database deki users listesine ekler..Son olarak o useri return eder...


    // deleteUserById methodu parametre olarak aldigi 'id; ile Database de o user i arar, bulamazsa UserNotFound exception firlatir
    // ilgili user mevcut ise onu Database users list inden siler...


    // updateUser methodu parametre olarak aldigi User i Database de arar, yoksa UserNotFound exception firlatir,
    // Varsa Datalase deki users listesinden silip, guncel halini Database users List ine ekler...


}
