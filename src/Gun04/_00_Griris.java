package Gun04;
// ctrl + alt + l yazilari otomatik duzeltir
public class _00_Griris {
    public static void main(String[] args) {

        byte ogrNot= 90;

        int notToplam = ogrNot;         // byte turunu int turu atmis olduk widening casting, genisletme yapmis olduk

        ogrNot = (byte)notToplam;       // bunu ancak veri kaybı oluşmuyorsa yani DEGER atılacak tipe sığıyorsa yapabilirim.
                                        // bunu da bilerek yaptığını belirtmek için, dönüşecek tipin başına, hedef tipin adı
                                        // parantez içinde yazılır. Daraltma(Narrow) yönünde dönüşüm(Casting) denir.
    }
}
