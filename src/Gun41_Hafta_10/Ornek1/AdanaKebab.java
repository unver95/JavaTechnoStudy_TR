package Gun41_Hafta_10.Ornek1;

public class AdanaKebab implements IFood{
    @Override
    public void taste() {
        System.out.println("Etin en guzel yeri");
    }

    @Override
    public double ucret() {
        return 50;
    }


    public void Marinade(){
        System.out.println("Et dunden ozel baharatlarla marine edildi");
    }

    public void grill(){
        System.out.println("Komur atesinde yavas pisirildi");
    }
}
