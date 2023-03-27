package Projeler._3_Proje_Alisveris_V2.service;

import Projeler._3_Proje_Alisveris_V2.entity.Cart;
import Projeler._3_Proje_Alisveris_V2.entity.User;
import Projeler._3_Proje_Alisveris_V2.exception.ItemNotFoundException;

public interface ShoppingService {

    //TODO Bu class a dokunmayiniz....OOP Abstraction

    void completePurchase(User currentUser, Cart shoppingCart) throws ItemNotFoundException;
}
