package Gun37_Interface.Soru5;

public class Test implements IGosterir, IYazdirir {

    @Override
    public void goser() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("Yazdirdi");
    }
    //    benzinli bir araç
//        direksiyon
//    benzinmetodları
//            farMetdoları
//
//    elektrikli bir araç
//        direksiyon
//    elektrikMotormetdoları
//            farmetodları
//
//
//    EletrkliBenzinli araç yapmaya kara verdiniz.
//        direksiyon
//        benzinmetodları
//    elektrikMotormetdoları
//            farmetodları
}
