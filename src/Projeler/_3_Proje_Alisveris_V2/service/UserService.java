package Projeler._3_Proje_Alisveris_V2.service;



import Projeler._3_Proje_Alisveris_V2.entity.User;
import Projeler._3_Proje_Alisveris_V2.exception.UserNotFoundException;

import java.util.List;
import java.util.Scanner;

public interface UserService {

    // TODO Bu class a dokunmayiniz....OOP Abstraction
    List<User> getAllUser();

    User getUserById(int id) throws UserNotFoundException;

    User addUser();

    void deleteUserById(int id) throws UserNotFoundException;

    void updateUser(User user);

    // TODO Bu class a dokunmayiniz....OOP Abstraction
}
