public class Main {
    public static void main(String[] args) {

        int sayi1=12;
        sayi1=13;
        //-+ 2 milyar arasınd sayı tutar bellekte 2 byte yer kaplar.İntegerdır(tamsayi)

        byte sayi2=12;
        sayi2=127;
        //byte -128 ile +127 arasında sayı tutabilir. Bellekte 1 byte yer kaplar integerdır

        long sayi3=13;
        sayi3=1231293712;
        // çok daha yuksek degerler tutar. Bellekte 8 byte yer kaplar. Bu yüzden heryerde kullanılmaz. integer

        double  sayi4=12.34;
        sayi4=14.3;
        //ondalıklı sayılar tutar. 8 bytedır. Default olarak bu kullanılır

        float   sayi5=12.77;
        sayi5=12.33;
        //ondalıklı syı tutar fakat daha ufak ondalıklı sayılar tutar cok fazla kullanılmaz

        //genellıkle int ve double kullanılır. !!  Örngein tc kimlik numarası long olarak kullanılır

        char    karakter='a';

        //char karakter="a" yapamayız ""string olur. yada 'ab' yazamayız. 2 byte karakter tutar. ascıı

        boolean dogruMu=true;
        boolean kisiYasi15denFazlamı=false;

        // 1 byte veri tutan 0 veya 1 dir.




    }
}