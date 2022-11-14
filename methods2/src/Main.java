public class Main {
    public static void main(String[] args) {

        int toplam = topla2(4, 3, 5, 7, 8, 9, 10);
        System.out.println(toplam);

    }


    public static int topla2(int... sayilar) {

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;

        }
        return toplam;

    }

}