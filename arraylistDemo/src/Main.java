import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar=new ArrayList(    );
        System.out.println(sayilar.size());//kaç elemanı var dedik 0 çıktısı verdi
        //array listte diziler gibi sınır yok istediğimiz kadar ekleyebiliriz
        sayilar.add(1);//1 sayısı ekledi
        sayilar.add(10);
        sayilar.add("ankara");
        System.out.println(sayilar.size());//kaç elemanı var dedik 3 çıktısı verdi
        System.out.println(sayilar.get(0));//sayilar.get 0. elemanı yazdırdık 1 cıktısı verdi
        sayilar.set(0,100);//.set ile 0. elemanı 100 yaptık
        System.out.println(sayilar.get(0));//0. elemanı sorguladık 100 olarak çıktı verdi
        sayilar.remove(0);//listeden bir index silmek için kullanılır. 0.yı sildik
        //bir remove işlemi yapılınca liste sola dogru kayar. Yani artık 0. eleman 10 olur
        sayilar.clear();//tüm elemanları siler

        for (Object i:sayilar){
            System.out.println(i);  //for dongusu ile butun elemanları yazdırdık. Arada ankara oldugu ıcın object
        }

    }
}