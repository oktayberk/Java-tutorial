public class Main {
    public static void main(String[] args) {

    //For
         //ilk ; i nin başlangıcıdı, 2.; sayacın ne kadar sayacagıdır, 3.; artıs miktarı
        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
        }
        System.out.println("dongu bitti");
        // burada i+=2 oldugu için dongu 13579 yazdırır. Eger i =2 den baslarsak 2468 yazdırır
        for (int i = 1; i <10 ; i+=2) {

            System.out.println(i);
        }
        System.out.println("for dongu bitti");
        

        //while
        //burada i++ yazmazsak sonsuz dongu acarız.
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        //DO-while dongusu
        int j=1;
        do {
            System.out.println(i);
            j++;
        }
        while  (j<10);



    }
}
