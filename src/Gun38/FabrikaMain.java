package Gun38;

import Gun32___Enum.GununSorusu.Hocanin.Yaptigi.Pizza;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("model 5",310);
        ToyotaPirus toyota=new ToyotaPirus("pirus",1200);
        Bus bus=new Bus("IVECO",7000);

        //polymorphism
        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(bus);

        for (Vehicle v:arabalar) {
            System.out.println(v.getClass().getSimpleName()); //arabanin nerden geldigini yazacak
            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof TeslaCar){
                System.out.println("((TeslaCar) v).changeBattery() = " + ((TeslaCar) v).changeBattery());
                System.out.println("((TeslaCar) v).drive() = " + ((TeslaCar) v).drive());
            }
            if (v instanceof ToyotaPirus){
                System.out.println("((ToyotaPrius) v).changeBattery() = " + ((ToyotaPirus) v).changeBattery());
                System.out.println("((ToyotaPrius) v).drive() = " + ((ToyotaPirus) v).drive());
                System.out.println("((ToyotaPrius) v).changeOil() = " + ((ToyotaPirus) v).changeOil());
            }
            if (v instanceof Bus){
                System.out.println("((Bus) v).drive() = " + ((Bus) v).drive());
                System.out.println("((Bus) v).changeDiesel() = " + ((Bus) v).changeDeisel());
            }
        }
    }
}
