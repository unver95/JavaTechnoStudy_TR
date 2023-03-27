package Gun39_Abstract.Ornek_2;

import Utility.MyFunc;

public abstract class Sekil {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();


    public void ciz() {
        System.out.println(this.name + "isimli sekil cizildi");
    }


    @Override
    public String toString() {
        return "\nname: " + name +
                "\nAlan: " + MyFunc.yuvarla(alan()) +
                "\nCevre: " + MyFunc.yuvarla(cevre());


    }
}
