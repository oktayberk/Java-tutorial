public class Main {
    public static void main(String[] args) {

        int number=25;
        // sayinin 2 ye bölümünden kalan sayı kaç. Asal sayi 1 ve kendinden basla sayıya bölünmeyecek.
        //int remainderKalan=number% 2;

        for (int i = 2; i <number ; i++) {


            if (number %i == 0) {

                System.out.println("sayi asal sayidir");

            } else {
                System.out.println("sayi asal sayi degildir");
            }
        }
    }
}