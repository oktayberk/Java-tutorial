public abstract class GameCalculator {
    public abstract void  hesapla();
//hesapla olan bir imza zorunlu fakat her kullanıcı için override edilecek
    public final void gameOver(){
        System.out.println("oyun bitti");
    }
}
