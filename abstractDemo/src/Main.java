//musterinin veri tabanına kaydedilmesini istiyoruz.oracle mı MSSQL mi ona gore
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager.getCustomers();
    }
}