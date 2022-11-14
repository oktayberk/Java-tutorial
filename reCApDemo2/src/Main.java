public class Main {
    public static void main(String[] args) {

        //double  []  myList= new double[4];
        //veya
//diziyi bu şekildede tanımlayabilirim bu durumda süslü parantez açılıp değerler yazılır

        double[] myList = {1.2, 1.3, 4.3, 5.6};

        double total=0; //toplam sayı için bunu giriyorum

        double max = myList[0]; //en buyuk sayı için kullanılan işlem. max=1. eleamn dedik

        // for dongusunde mylist içerinde numberları gez diyoruz.
        for (double number : myList) {
    //eger dongudeki sayı o anki sayıdan(1. sayıyı belirledik) buyukse max= o anki sayı olur
            if (max < number) {
                max = number;
            }

            total = total + number; //sayıların toplamını alan komut
            System.out.println(number);

        }

        System.out.println("toplam:" + total);
        System.out.println("en buyuk sayi:" + max);

    }

}

