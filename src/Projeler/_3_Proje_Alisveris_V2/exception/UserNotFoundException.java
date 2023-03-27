package Projeler._3_Proje_Alisveris_V2.exception;

public class UserNotFoundException extends Exception {

    // TODO User bulunamadiginda "Boyle bir kullanici mevcut degildir" ikazi veren bir Exception tanimlayin...

    public UserNotFoundException(String message){
        super(message);
    }
}
