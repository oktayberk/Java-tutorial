public class ProductManager {
    public void  add(Product product){
        ProductValidator validator=new ProductValidator();//product validatoru cagırıyoruz
        if (validator.isValid(product)){//eger validotor içindeki product valid yani dogru ise
            System.out.println("eklendi");
        }
        else {
            System.out.println("bilgiler gecersiz");
        }
    }
}
