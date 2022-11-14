public class Main {
    public static void main(String[] args) {
        //mainin içerisinde sayi bulcamacayı cagırdık. Bu sayede sayı bulmacayı her seferidne yazmadan cagırabiliriz

        sayiBulmaca();

    }
    public static void sayiBulmaca(){


        int[]   sayilar=new int[]{1,2,3,5,7,9,0};
        int aranacak   =6;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi == aranacak) {
                varMi=true;
                break;

            }
        }
        if (varMi){
            System.out.println("sayi mevcuttur"+aranacak);
        }
        else   {
            System.out.println("sayi mevcut degildir"+aranacak);
        }

    }


}