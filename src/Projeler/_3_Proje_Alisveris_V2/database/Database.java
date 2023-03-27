package Projeler._3_Proje_Alisveris_V2.database;

import Projeler._3_Proje_Alisveris_V2.entity.Item;
import Projeler._3_Proje_Alisveris_V2.entity.User;
import Projeler._3_Proje_Alisveris_V2.enums.Color;
import Projeler._3_Proje_Alisveris_V2.exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<User> users = new ArrayList<>();
    public static List<Item> items = new ArrayList<Item>();

    //TODO BU CLASS DEGISTIRILMEYECEKTIR...

    static {

        Item item1 = new Item(1,"Macbook", Color.BLACK,1500);
        Item item2 = new Item(2,"IPhone",Color.GREEN,1200);
        Item item3 = new Item(3,"Samsung",Color.RED,800);
        Item item4 = new Item(4,"Mouse",Color.BLACK,100);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

    }

    //TODO BU CLASS dan BAZI KODLAR EKSILMISTIR... BAKINIZ GECEN HAFTAKI KODA..ONLARI SERVICE de yeniden tanimlamalisiniz...



    public void addUser(User user){
        users.add(user);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public Item findItemById(int id) throws ItemNotFoundException {
        for (Item item : items){
            if (item.getId() == id){
                return item;
            }
        }
        throw new ItemNotFoundException("Boyle bir urun stoklarimizda mevcut degildir");
    }

// TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------

    public List<Item> getAllItems(){
        return items;
    }





}
