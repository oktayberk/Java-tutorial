//staticleri genellikle araç yazarken kullanırız
//satic yapılarda newleyerek degil de . koyarak ulaşırız
//static tanımlanan nesneler bellekten atılmadıgı için heryerde kullanılmaz, genellikle yardımcı fonklarda kullanılır


public class Main {
    public static void main(String[] args) {

        ProductManager manager=new ProductManager(); //product manageri cagırıyoruz
        Product product=new Product(); //product nesnesi olusturdu
        product.price=10;
        product.name="mouse";

        manager.add(product); //producti ekleme komutu cagırdık


    }
}