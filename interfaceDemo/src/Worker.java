//bizim çalışanımız
//iki çalışan türününde kendisine göre work u var
//bizim personelimiz aynı zamanda IEatable ve payable
public class Worker implements IWorkable,IEatable,IPayable{

    @Override
    public void work() {
        //bizim çalışanımızında bir çalışma kuralı var ornegin 9 5
    }

    @Override
    public void eat() {
    //bizim personelimiz aynı zamanda IEatable olduu için bu alan da acıldı
    }

    @Override
    public void pay() {
        //bizim personelimize maaş ödüyoruz
    }
}
