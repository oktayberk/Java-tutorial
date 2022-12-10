public class Main {
    
    public static void main(String[] args) {
    //CustomerMan. turunde bir ornek customerman. olausturuyoruz
        CustomerManager customerManager = new CustomerManager(); //class cagırma bu şekilde yapılır
        //burada ise Customermanager classındaki kodları . koyarak cagırabiliryorum
     customerManager.Add();
     customerManager.Remove();
     customerManager.Update();
     //bu sayede birden cok ekleme yapmaktan kurtulup sadece class ekleyebiliriz
        // classlar refereans tiptir
    //class olursturulurken ramin stack kısmında sol taraf oluşturuluyor. new sonrası yazdıgımız ramin heap kısmında bir alan olusturur
    //burada bellekteki yer öenmlidir. Aynı zamanda custumerManager2 oluşturursak heapte aynı alanı kaplarlar. Ramdeki referan nuamrası bakımından 1 ve 2 aynı olur

    //value tip
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;// burada sayı2=sayi1 degeri yani=10 oldu
        sayi1=30;//burada sayi1 i 30 a eşitledik fakat sayi 2 hala 10 a eşit.
        System.out.println(sayi2);//çıktısı 10 olur

     //referans tip

        int [] sayilar1=new int[]{1,2,3};
        int [] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;//sayilar2 nin degeri 1 e eşit
        sayilar1[0]=10;//hem sayilar 1 hem sayılar 2 degişti
        System.out.println(sayilar2[0]);//10 sayısı cıktısı alınır cunku diziler referans tiptedir

    }
}
