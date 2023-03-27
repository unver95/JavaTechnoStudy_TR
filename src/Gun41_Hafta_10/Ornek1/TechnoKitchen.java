package Gun41_Hafta_10.Ornek1;

import Utility.MyFunc;

public class TechnoKitchen {

    public static void hazirla(IFood food) {

        MyFunc.Bekle(2);
        if (food instanceof AdanaKebab) {
            ((AdanaKebab) food).Marinade();
            ((AdanaKebab) food).grill();
        } else if (food instanceof Lahmacun) {
            MyFunc.Bekle(1);
            ((Lahmacun) food).dough();
            MyFunc.Bekle(1);
            ((Lahmacun) food).addMeat();
            MyFunc.Bekle(1);
            ((Lahmacun) food).bake();
        } else if (food instanceof Borsh) {
            MyFunc.Bekle(1);
            ((Borsh) food).boil();
            MyFunc.Bekle(1);
            ((Borsh) food).eatTomorrow();
        } else if (food instanceof Palov) {
            MyFunc.Bekle(1);
            ((Palov) food).boil();
            MyFunc.Bekle(1);
            ((Palov) food).fry();
        }
    }
}
