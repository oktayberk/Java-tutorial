//interfacelerde abstract ve normal classlaar gibi referans tutabilir
//ornegin bizim oracle ve sql için interfacelerimiz olsun
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.customerDal=new OracleCustomerDal();
        customerManager.add();


    }
}