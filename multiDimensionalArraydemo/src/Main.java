public class Main {
    public static void main(String[] args) {
        //[][] yapmak cok boyutlu diziyi gosterir
        String [][] sehirler= new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="bursa";
        sehirler[0][2]="kütahya";
        sehirler[1][0]="konya";
        sehirler[1][1]="kayseri";
        sehirler[1][2]="adana";
        sehirler[2][0]="mersin";
        sehirler[2][1]="antalya";
        sehirler[2][2]="izmir";

        //bu şehirleri bölge olarak yazdırmak için : once i sonra j yazdırdık sırayla

        for (int i = 0; i <=2 ; i++) {

            System.out.println("---------------------");

            for (int j = 0; j <=2 ; j++) {
                System.out.println( sehirler[i][j]);
            }
        }

    }
}