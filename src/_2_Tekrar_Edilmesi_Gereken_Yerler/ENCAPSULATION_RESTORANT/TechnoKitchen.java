package _2_Tekrar_Edilmesi_Gereken_Yerler.ENCAPSULATION_RESTORANT;

public class TechnoKitchen {

    public static void hazirla(IFood food) {
        if (food instanceof AdanaKebab) {
            ((AdanaKebab) food).Marinade();
            ((AdanaKebab) food).grill();
        } else if (food instanceof Lahmacun) {
            ((Lahmacun) food).dough();
            ((Lahmacun) food).addMeat();
            ((Lahmacun) food).bake();
        } else if (food instanceof Borsh) {
            ((Borsh) food).boil();
            ((Borsh) food).eatTomorrow();
        } else if (food instanceof Palov) {
            ((Palov) food).boil();
            ((Palov) food).boil();
        }
    }
}
