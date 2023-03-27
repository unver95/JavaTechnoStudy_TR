package Gun35.Odev.Soru_4;

public class rentApartments {
    private String name;
    private boolean balconyOrNo;
    private Apartment apartment;

    rentApartments(String name, Apartment apartment, boolean balconyOrNo) {
        setName(name);
        setApartment(apartment);
        setBalconyOrNo(balconyOrNo);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Apartment getApartment() {
        return this.apartment;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    public boolean getBalconyOrNo() {
        return this.balconyOrNo;
    }

    public int OdaFiyatlari() {
        int rent = 0;

        if (apartment.equals(Apartment.ROOM0)) {
            rent = 1400;
        } else if (apartment.equals(Apartment.ROOM1)) {
            rent = 1700;
        } else if (apartment.equals(Apartment.ROOM2)) {
            rent = 2200;
        } else if (apartment.equals(Apartment.ROOM3)) {
            rent = 2700;
        }
        return rent;
    }

    public int Balcony() {
        int extra = 0;
        if (balconyOrNo = true) {
            extra = 200;
        }
        return extra;
    }

    public String toString() {
        return getName() + " rent is " + (Balcony() +OdaFiyatlari());
    }
}
