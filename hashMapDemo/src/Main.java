import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        //<calısıcagımız tipleri yazıyoruz>
        HashMap<String ,String> sozluk= new HashMap<String ,String >();
        sozluk.put("book","kitap");//sozluk olusturudugumuzi çin book=kitap gibi dusunebiliriz
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size());//eleman sayısını verir
        //for ile (string burayaistedigimizkelimeyiyazabiliriz: sozluk.keySet)
        //keyset anahtar listesini veriyor comp book ve table
        for (String item: sozluk.keySet()){
            System.out.println(item);//sadece comp table book eglir
            System.out.println("eleman:"+item+"deger:"+sozluk.get(item));
            //bu sayede sırayla hem elemanı hemde degerleri verir
        }
        System.out.println(sozluk);//hepsini yazdırmak için
        System.out.println(sozluk.get("table"));//table in karsısı masa olur
        sozluk.remove("table");//table ı silmeye yarar
        sozluk.clear();//sozlugun tamamını siler
    }
}
