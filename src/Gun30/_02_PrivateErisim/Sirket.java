package Gun30._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1 = new Calisan();

        cal1.id = 1; //direkt erisim olmamasi lazim
                     //siradan gelen rakam vermeli

        cal1.name = "sena";
        cal1.surname = "akbas";
        //cal1.password="122"; //direkt erisiliyor
        //hem de kontrolsuz atandi
        //direkt erisime kapali olmali
        //bunun yerine classa method ekledim
        cal1.sifreAta("1223");
        cal1.sifreAta("1234awwd");


        cal1.sifreGoster();
    }
}