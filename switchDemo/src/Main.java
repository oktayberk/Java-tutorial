public class Main {
    public static void main(String[] args) {
        //bir ogrencinin aldıgı nota gore ona puan veren sistem
        char    grade='B';
        switch (grade){
            case    'A':  //eger case A ise bbunu yap diyoruz.

                System.out.println("Mukemmel.Gectiniz");
                break ;
            case    'B':
                System.out.println("Mukemmel degil ama.Gectiniz");
                break ;
            case 'C':
                System.out.println("kotu ama.Gectiniz");
                break ;
            case    'D':
                System.out.println("malesek.Kaldınız");
                break ;
            default: // if  deki else gibi
                System.out.println("lutfen gecerli bir not giriniz!!");
        }


    }
}