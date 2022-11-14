import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        int total=0;
        BufferedReader reader=null  ;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
            String line=null;//dosyatda okuma satır satır olur. Eger okuyacak şey yoksa dıye null verdik
            while ((line=reader.readLine())!=null)
                total+=Integer.valueOf(line);//okunan string degerleri intagera ceviriyoruz
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("toplam="+total);
        catch (Exception e) {//ddosyayı bulamazsam hatası
            throw new RuntimeException(e);
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}