package Projeler._3_Proje_Alisveris_V2.service;

import Projeler._3_Proje_Alisveris_V2.database.Database;
import Projeler._3_Proje_Alisveris_V2.entity.Item;
import Projeler._3_Proje_Alisveris_V2.exception.ItemNotFoundException;


import java.util.List;

public class ItemServiceImp implements ItemService {


    @Override
    public List<Item> getAllItems() {
        return null;
    }


    @Override
    public Item getItemById(int id) throws ItemNotFoundException {
        if (Database.items.contains(id)) {
            return getItemById(id);
        }
        throw new ItemNotFoundException("Boyle bir Item yok");
    }


    @Override
    public void addItem(Item item) {
        Database.items.add(item);
    }


    @Override
    public void deleteItemById(int id) throws ItemNotFoundException {
        for (Item parcala : Database.items) {
            if (parcala.getId() == id) {
                Database.items.remove(parcala);
            }
        }
        throw new ItemNotFoundException("Boyle bir urun olmadigi icin silinemedi");
    }


    // updateItem methodu parametre olarak aldigi Item i Database de arar, yoksa ItemNotFound exception firlatir,
    // Varsa Datalase deki items listesinden silip, guncel halini Database List ine ekler...
    @Override
    public void updateItem(Item item) {
        for (Item parcala : Database.items) {
            try {
                if (parcala == item) {
                    Database.items.remove(item);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // ItemService icerisinde tanilanmis govdesiz tum methodlarin implementation unu bu class da yapacaksiniz...
        // Class ismindeki KIRMIZI ikaza giderseniz 'implement mothods' secenegini goreceksiniz... Onu secin ve baslayin...


        // GetAllItems methodu Database e gidip oradan butun item lari alir ve bir List olarak return eder...


        // getItemById methodu parametre olarak aldigi id ile Database de boyle bir item var mi diye kontrol eder,
        // yoksa, ItemNotFound exception firlatir, varsa ilgili item i return eder...


        // addItem methodu, parametre olarak aldigi item i Database deki items listesine ekler...


        // deleteItemById methodu parametre olarak aldigi id ile Database de o urunu arar, bulamazsa ItemnotFound exception firlatir
        // ilgili item mevcut ise onu Database list inden siler...


        // updateItem methodu parametre olarak aldigi Item i Database de arar, yoksa ItemNotFound exception firlatir,
        // Varsa Datalase deki items listesinden silip, guncel halini Database List ine ekler...

    }
}
