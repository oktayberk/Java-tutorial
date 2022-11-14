public class AccountManager {
    private double balance;//hesaptaki para miktarı

    public void deposit(double amount){//amaount=mıktar deposit=para yatırmak
        balance = getBalance() + amount;//hesap = hesap+yatırılanpara

    }

    public void withdraw(double amounth) throws BalanceInsufficentException {
       if (balance>=amounth) {
           balance = getBalance() - amounth;//hesaptan para cekmek
       }
       else {
        throw new BalanceInsufficentException("bakiye yetersiz");//bakiye yetersiz hatası
       }
    }

    public double getBalance() {//hesaptaki bilgileri okumak. Sağ tık>>refactor>>encapsule fiels yoluyla
        return balance;
    }
}
