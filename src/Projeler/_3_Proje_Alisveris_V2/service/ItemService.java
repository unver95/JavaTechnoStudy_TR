package Projeler._3_Proje_Alisveris_V2.service;


import Projeler._3_Proje_Alisveris_V2.entity.Item;
import Projeler._3_Proje_Alisveris_V2.exception.ItemNotFoundException;

import java.util.List;

public interface ItemService {

    // TODO Bu class a dokunmayiniz....OOP Abstraction
    List<Item> getAllItems();

    Item getItemById(int id) throws ItemNotFoundException;

    void addItem(Item item);

    void deleteItemById(int id) throws ItemNotFoundException;

    void updateItem(Item item);

    // TODO Bu class a dokunmayiniz....OOP Abstraction
}
