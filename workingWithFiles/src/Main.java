import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    readFile();
    writeFile();
    readFile();
    }

    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true)) ;//sonuna ,true eklersek ustune yazar. Eklemezsek içerigini siler ver direk yazar
            writer.newLine();//yeni satır olustur
            writer.write("ahmet");//ahmeti ekle
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile(){
        File file= new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader= new Scanner(file);
            while (reader.hasNextLine()){//bir sonrakı satırı okuyabildigi sürece
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();//okuyamadıgında kapatır
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file= new File("C:\\javademos\\files\\students.txt");
        if (file.exists()){
            System.out.println("dosya ismi:"+file.getName());//dosya ismi okuyabildigimiz kod
            System.out.println("dosya yolu:"+file.getAbsolutePath());//dosya yolunu okuyabildigimiz kod
            System.out.println("dosya yazılabilir mi:"+file.canWrite());//dosya yazılabilirligine baktıgımız kod
            System.out.println("dosya okunabilir mi:"+file.canRead());//dosya yolunu okuyabildigimiz kod
            System.out.println("dosya boyutu:"+file.length());//dosya boyutuna baktıgımız kod


        }
    }

    public static void createFile(){
        File file= new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("dosya olusturuldu");
            }
            else {
                System.out.println("dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}