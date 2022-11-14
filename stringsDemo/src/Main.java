public class Main {
    public static void main(String[] args) {

        String mesaj    ="bugun hava guzel";
        System.out.println(mesaj);
        System.out.println("eleman sayısı:"+mesaj.length());//stringdeki mesajdaki eleman sayısını gosterir
        System.out.println("5. elemanım:"+mesaj.charAt(4));  //bir kişinin tcsi 1 le baslıyorsa 2 ile baslıyorsa gibi kullanılır. 5. elemanını yazdırır

        System.out.println(mesaj.concat("yasasın!")); //mesajın sonuna girilen metni ekler fakat kalıcı olarak eklemez 1 seferlik

        System.out.println(mesaj.startsWith("B"));//b ile baslıyormu baslıyorsa true dondurur. "A" dersek flase döner

        System.out.println(mesaj.endsWith("l"));//l ile bitiyormu

        //
        char    []  karakterler=new char[5];
        //karkaterleri al operasyonu. Bu ifade bişey döndürmez. Burada biz 0 dan basladık, 4. karakterde bitirdik, karakterlere atadık, kaçıncı karakterden itabaren atmaya baslayayım şeklinde
        mesaj.getChars(0,5,karakterler,0);

        System.out.println(karakterler);

        //yogun olarak kullanuılır. Belirlenen karakterin kacıncı karakter oldugunu bulur.
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("av"));//av oaln kısmı arar
        System.out.println(mesaj.lastIndexOf("a"));//aramaya sondan baslar. Sagdan itibaren sayar

        //amacımız bir karakteri digeri ile değiştirmek. Bize yeni bir metin veirr eskiyi degiştirmez.
        System.out.println(mesaj.replace(' ','-'));
        //Bu şekilde istedigimiz forma donsuturerek kulanabiliriz
        String yeniMesaj   =    mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        //bir metnin içerisinden parça almak. Örnegin 2. karakterden sonra parçalar
        System.out.println(mesaj.substring(2));
        //burada ise 2 ve 5 arasındaki metni alır
        System.out.println(mesaj.substring(2,5));

        //bugun hava cok guzeldeki ifadeleri ayırmak için boslukları buluruz.Bunu split ile yaparız

        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        };

        //mesajı kucuk harfe ve buyuk harfe ceviren kod
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        //.trim fonksiyonuyla basındaki ve sonundaki boslukları atarız
        System.out.println(mesaj.trim());

    }
}