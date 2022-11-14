// Java program explaining Date class methods 
// compareTo(), getTime(), equals() 
import java.util.*;
public class NewClass
{
    public static void main(String[] args)
    {
        Date d2 = new Date(1997, 06, 20);
        Date d1 = new Date(2022, 10, 14);

        // Use of equal() method 

        long count1 = d1.getTime();
        long count2 = d2.getTime();
        System.out.println("Girilen 1. tarihin toplam milisaniyesi : " + count1);
        System.out.println("Girilen 2. tarihin toplam milisaniyesi : " + count2);
        long milliseconds=count1-count2;
        System.out.println("Girilen iki tarihin milisaniye olarak farkı:"+milliseconds+" milisaniye");
        long seconds=milliseconds/1000;
        System.out.println("Girilen iki tarihin saniye olarak farkı:"+seconds+" saniye");
        long min=seconds/60;
        System.out.println("Girilen iki tarihin dakika olarak farkı:"+min+" saat");
        long hour=min/60;
        System.out.println("Girilen iki tarihin saat olarak farkı:"+hour+" saat");
        long day=hour/24;
        System.out.println("Girilen iki tarihin gun olarak farkı:"+day+" gun");
        long  month=day/30;
        System.out.println("Girilen iki tarihin ay olarak farkı:"+month+" ay");
        long   year=month/12;
        System.out.println("Girilen iki tarihin yıl olarak farkı:"+year+" yıl");

        System.out.println();

    }
} 