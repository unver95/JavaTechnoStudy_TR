package Projeler._2_Proje_Alisveris.entity;

import Projeler._2_Proje_Alisveris.enums.City;

public class Address {

    //----------------------Fields---------------------------------------------------------------------
    // 3 adet private instance degisken tanimlayin... String description - City city - String zipCode
    // City ayri bir sinif olarak tanimlanmistir, ilgili siniftaki odevlerinizi yapiniz...

    private String description;
    private City city;
    private String zipCode;


    //----------------------Constructor ---------------------------------------------------------------------
    // Tum degiskenler constructor ile initilize edilmelidir...

    public Address(String description, City city, String zipCode){
      setDescription(description);
      setCity(city);
      setZipCode(zipCode);
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

    public void setCity(City city){
        this.city = city;
    }
    public City getCity(){
        return this.city;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return zipCode;
    }
}