public class Main {
    public static void main(String[] args) {

        int sayi = 40;
        if (sayi < 30) {
            System.out.println("sayi 20 den kucuktur");
        }
        //if parantez içindeki şartı saglıyorsam bu blogu çalıştır demek
        else if (sayi==40) {
            System.out.println("sayi 40 a eşittir");
            //else ifde if ile aynıdır
        } else {
            System.out.println("sayi 20 den kucuk degildir");
        }
        //else, if ve else if  deki şartı saglamıyorsa bu blogu calıstır demek
    }
}
