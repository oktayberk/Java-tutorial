//built-in javada tanımlı packageler
//paketler arası iletişim import ile olur
//scanner kullanıcan bilgi almaya yarar data okumaya yarar
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("adiniz:");

        String isim= scanner.nextLine();

        System.out.println("merhaba"+isim);

        DortIslem dortIslem=new DortIslem();//bunu yzazdıgmızda otomatik olarak dortislem importlanır
        dortIslem.topla(2,3);
        Logaritma logaritma=new Logaritma();//bunu yzazdıgmızda otomatik olarak logaritma importlanır
        //biz logaritma ve dort islemi importlamak yerine direk import matematik diyebiliriz!!!!
    }
}