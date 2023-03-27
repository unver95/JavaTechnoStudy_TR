package Projeler._2_Proje_Alisveris.entity;

import Projeler._2_Proje_Alisveris.enums.Color;

public class Item {

    //----------------------Fields ---------------------------------------------------------------------
    // 4 adet private field tanimlayin - int cinsinden id, String cinsinden name, Color cinsinden color, double cinsinden price
    // Color sinifi bir ENUM olarak tanimlandigindan ilgili sinifdaki odevlerinizi kontrol edin...

    private  int id;
    private  String name;
    private Color color;
    private double price;





    //---------------------- Constructor ---------------------------------------------------------------------
    // Tum degiskenleri constructorda initilize edin...


    public Item(int id, String name, Color color, double price){
        setId(id);
        setName(name);
        setColor(color);
        setPrice(price);
    }




    //----------------------Getter and Setter ---------------------------------------------------------------------

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setColor (Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }










    //---------------------- ToString ---------------------------------------------------------------------


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
