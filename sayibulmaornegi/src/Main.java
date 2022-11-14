public class Main {
    public static void main(String[] args) {

        int []  sayilar=new int[]{1,2,5,7,9,0};
        int aranacak =5;

        //sayilar içerisinde sayi arıyorum demek sayi:sayilar
        for (int sayi:sayilar) {
            if (sayi == aranacak) {
                System.out.println("sayı var ");

            }
        }
    }
}