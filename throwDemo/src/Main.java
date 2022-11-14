public class Main {
    public static void main(String[] args) {
        AccountManager manager=new AccountManager();
        System.out.println("hesap="+manager.getBalance());
        manager.deposit(100);//hesaba 100 lıra yatırdık
        System.out.println("hesap="+manager.getBalance());
        try {
            manager.withdraw(90);//90 lira cektik
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("hesap="+manager.getBalance());
        try {
            manager.withdraw(15);
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("hesap="+manager.getBalance());//burada -10 lira kaldı diyor ama burada hesaptan paar çekilememesi gerekiyor

    }
}