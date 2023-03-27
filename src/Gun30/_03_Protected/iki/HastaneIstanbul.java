package Gun30._03_Protected.iki;

import Gun30._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public class HospitalIstanbul {
        public static void main(String[] args) {
            Doctor dr=new Doctor("Burak");
            //Doctor dr=new Doctor(); default sadece kendi paketi ulasabilir
            dr.hastaneAdi="Istanbul";
        }
    }
}
