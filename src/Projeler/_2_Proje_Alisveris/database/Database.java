package Projeler._2_Proje_Alisveris.database;

import Projeler._2_Proje.exception.ItemNotFoundException;
import Projeler._2_Proje_Alisveris.entity.Item;
import Projeler._2_Proje_Alisveris.entity.User;

import java.util.ArrayList;
import java.util.List;

// TODO BU SINIFTA DEGISIKLIK YAPILMAYACAKTIR ------------------------------------------------------------------
public class Database {

    // Bu sinifta herhangi bir odeviniz bulunmamaktadir... Bir sonraki hafta burayla ilgili calisma yapacagiz...

    public static List<User> users = new ArrayList<>();
    public static List<Item> items = new ArrayList<Item>();

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
