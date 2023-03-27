package Gun46_Hafta_11;

public class _04_MainArgument {
    public static void main(String[] args) {

        //copy dosya1 dosya2    : 1 satırda çalıştı
        //
        //     çalışacağı zaman dosy1 ve dosya2 parametresini
        //     alarak çalışacak
        //çalışınca
        //dosya1 dosya2 olarak kopyalandı
        //
        //copy  entera bastın
        //kaynak dosya : dosya1
        //hedef dosya : dosya2    // 3 satırda çalıştı
        //
        //entera bastım
        //dosya1 dosya2 olarak kopyalandı

        for (String s: args)
            System.out.println("s: " + s);
    }
}
