package Gun15;

public class GununSorusu_2 {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        //      * 4 Bosluk 1 yildiz
        //     ** 3 Bosluk 2 yildiz
        //    ***
        //   ****
        //  *****

        for(int i =1; i <=5; i++){
            for (int j =5; j >=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1; i<=5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
