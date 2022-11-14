import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//veritabanı yardımcı classı
public class DbHelper {
    private String userName="root";//kullanıcı adımız
    private String password="12345";//parolamız
    private String dbUrl="jdbc:mysql://localhost:3306/world";//server statusde verilen portumuz 3306. biz bu portdaki world veritabanına erişmeye calsııyoruz

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("error"+exception.getMessage());
        System.out.println("error code "+exception.getErrorCode());

    }

}
