import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String > sehirler=new ArrayList<String>(); //string olduugu için sadece stringi ekliyoruz
        sehirler.add("ankara");
        sehirler.add("istanbul");
        sehirler.add("izmir");

        sehirler.remove("istanbul");//burada remove yaparken direk şehir ismi yyazarak da silebiliyoruz
        Collections.sort(sehirler);//bu verdigimiz sehirleri baş harfine göre sıralamaya yarar
        for (String sehir:sehirler){
            System.out.println(sehir); //burada çıktı olarak sadece izmir ve ankara alınır istanbul silindi
        }

    }
}