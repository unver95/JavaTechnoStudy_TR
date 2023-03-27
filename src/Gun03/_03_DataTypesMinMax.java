package Gun03;

import javax.print.DocFlavor;

public class _03_DataTypesMinMax {
    public static void main(String[] args) {

        // kucuk byte sadece rakam saklaniyor. Byte da da icinde baska seyler de oluyor ornek olarak Byte.MIN_VALUE gibi.

        byte byteMinDeger = Byte.MIN_VALUE;
        byte byteMaxDeger = Byte.MAX_VALUE;

        System.out.println("byteMaxDeger = " + byteMaxDeger);
        System.out.println("byteMinDeger = " + byteMinDeger);

        System.out.println();

        System.out.println("Byte.Max.VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN.VALUE = " + Byte.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE =" + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE =" + Integer.MIN_VALUE);
        System.out.println("Long.MAX_VALUE =" + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE =" + Long.MIN_VALUE);

        System.out.println();

        System.out.println("Float.MAX_VALUE =" + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE =" + Float.MIN_VALUE);
        System.out.println("Double.MAX_VALUE =" + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE =" + Double.MIN_VALUE);
    }
}
