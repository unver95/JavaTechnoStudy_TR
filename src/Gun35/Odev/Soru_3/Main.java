package Gun35.Odev.Soru_3;

/* 3-
Burada iki class vardır. Biri Main diğeri ise Subscribe.

**Subscribe class'ının içinde;**

Bu variables'ları **private** oluşturunuz.

String name

boolean doYouWanaSubscribe

String whichMember

3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

**Main class'ın içinde;**

Örnek;

Name is Victoria, doYouWanaSubscribe true, whichMember Gold

Eğer user(kullanıcı) **Gold** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon. yazdırınız.**

Eğer user(kullanıcı) **Silver** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.**

Eğer user(kullanıcı) **Bronze** member(üye) olmak istiyorsa;

**Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.**

Eğer user(kullanıcı) member(üye) olmak istemiyorsa;

**See you when you want to be a member. Thanks yazdırınız.**
 */

public class Main {
    public static void main(String[] args) {
        Subscribe s = new Subscribe("Senna", true, MemberShip.SILVER);
        if (s.getDoYouWannaSubscribe() == true) {
            if (s.getMemberShip() == MemberShip.GOLD) {
                System.out.println("Welcome to membership" + s.getName() + ". Your membership is 40 dollar for month you can enjoy the videos, all homework and see you soon.");
            } else if (s.getMemberShip() == MemberShip.SILVER) {
                System.out.println("Welcome to membership" + s.getName() + ". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
            } else if (s.getMemberShip() == MemberShip.BRONZE) {
                System.out.println("Welcome to membership" + s.getName() + ". Your membership is 10 dollar for month you can enjoy the videos.");
            } else {
                System.out.println("Involid");
            }
        } else {
            System.out.println("See you when you want to be a member. Thanks.");
        }
    }
}
