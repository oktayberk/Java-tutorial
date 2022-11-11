//ornegin bir oyun yazıyoruz. bu oyunda puan hesaplama işlemi yapacagız. Puan hesaplamak için algoritma yazıyoruz.
//Bu oyunda erkek kadın ve cocuk olarak 3 hesap yaptırıcagız.
public class Main {
    public static void main(String[] args) {
        WomanGameCalculator     womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        // abstract sınıfları her zamöan bu şekilde ezmemiz gerekir
        GameCalculator gameCalculator=new GameCalculator() {
            @Override
            public void hesapla() {

            }
        };

        //bu şekildede kullanılabilir
        GameCalculator gameCalculator1 =new WomanGameCalculator();


    }
}