public class Main {
    public static void main(String[] args) {
        try {

            int [] sayilar=new  int[]{1,2,3};
            System.out.println(sayilar[5]);
        }
        //birden fazla catch yazılabilir. Bizim hatamız arrayindex. 1inci catch yakalayamaz fakat 2. catch yakalar
        catch (StringIndexOutOfBoundsException exception){//bu hata türünde bunu yap
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){//bu hata türünde bunu yap
            System.out.println(exception);
        }
        catch (Exception exception){//eger iki turdede hata alınmıyorsa bu şekilde loglanmak için bırakılır exception hataların temelidir.
            //örnegni kullanıcı hesapta para yok hatası alıyorsa yukleme sayfasına yonlendırılebilir. Bu yüzden hata türü onemlidir ve bütün hatalarda exception kullanılmaz
            System.out.println("Loglandı"+exception);
        }
        finally {
            System.out.println("finallykodu");

        }


    }
}