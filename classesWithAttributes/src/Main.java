public class Main {
    public static void main(String[] args) {
        Product product= new Product();
        product.setName("laptop");
        product.setId(1);
        product.setDescription("asus laptop");
        product.setPrice(5000);
        product.setStockAmaunt(5000);


        ProductManager  productManager= new ProductManager();
        productManager.Add(product);

        //goruldugu gibi claslar birbirinin içerisinde kullanılabilir


    }
}