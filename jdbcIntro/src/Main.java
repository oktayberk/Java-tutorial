import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
    }
    //1. delete :
    public static void deleteData() throws  SQLException{

        Connection connection=null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try {
            connection=helper.getConnection();
            String sql="delete from city where id=?" ;//city içerisinde şu id dekini sil demek
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4082);//eger id yi kendimi girmek istersek bu şekilde yapacagız
            int result= statement.executeUpdate();
            System.out.println("Kayıt silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        }finally {
            connection.close();
            statement.close();//5. adım statementı kapattık
        }
    }

    //2. update
    public static void  updateData () throws SQLException{
        Connection connection=null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement=null;   //instert ifadeleri prepared statement ifadesi ile yapılır.

        ResultSet resultSet;

        try {
            //eger bunları kullanıcıdan almak ıstersek :
            connection=helper.getConnection();
            String sql="update city set population=100000, district='Turkey' where id=?" ;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4082);//eger id yi kendimi girmek istersek bu şekilde yapacagız

            int result= statement.executeUpdate();
            System.out.println("Kayıt guncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        }finally {
            connection.close();
            statement.close();//5. adım statementı kapattık
        }
    }

    //3.select
    public static void selectDemo() throws  SQLException{

        Connection connection=null;
        DbHelper helper= new DbHelper();
        Statement statement=null;   //statement=sql cümlecigi demek. Bu bizim my sql de yazdıgımız satırın karsılıgı
        ResultSet resultSet; //yazılan statementtan alınan sonuclar toplulugana resultset denir


        try {
            connection=helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");

            ArrayList<Country> countries=new ArrayList<Country>(); //aray liste resultseti aktaracagız

            while (resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region"))); //tek tek hepsini cagırdık
            }
            System.out.println(countries.size()); //counteriesin sizeını gormek için yazıyoruz aktarılıp aktarılmagdıgına bakmak ıcın

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        }finally {
            connection.close();
        }

    }

    //4.insert
    public static void insertData() throws  SQLException{
        Connection connection=null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement=null;   //instert ifadeleri prepared statement ifadesi ile yapılır.

        ResultSet resultSet;

        try {
            //eger bunları kullanıcıdan almak ıstersek :
            connection=helper.getConnection();
            String sql="insert into city (Name,CountryCode,District,Population) values(?,?,?,?)"; //oncelikle girilecek degerlere ? veririz
            statement=connection.prepareStatement(sql);
            statement.setString(1,"düzce2"); //once 1. parametre oldugunu daha sonra parametrenın ıcerıgını gırıyoruz
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);
            int result= statement.executeUpdate();
            System.out.println("Kayıt eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        }finally {
            connection.close();
            statement.close();//5. adım statementı kapattık
        }
    }

}
