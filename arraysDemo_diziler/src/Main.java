public class Main {
    public static void main(String[] args) {
        // stringden sonra [] koyarak dizi oldugunu belirttik. new string[3] ile eleman sayısını belirttik
        String [] ogrenciler=  new  String[3];
        ogrenciler[0]="oktay";
        ogrenciler[1]="aras";
        ogrenciler[2]="hazal";

        for (int i = 0; i <ogrenciler.length ; i++) {
// burada i 0 dan baslar ve ogrenciler.length yani dizi uzunluguna kadar devam eder ve alttaki kodu yazdırır
            System.out.println(ogrenciler[i]);

        }
    //ustteki for ile aynı işi yapan for dongusu
        // burada string elemanların veri tipi içinde ne tutuyor ogrenci nerdeki ogrenci ogrencilerdeki
        for (String ogrenci:ogrenciler)


    }
}