//classlar birden fazla interface implements edebilirler !! rnegin IcustomerDal ve Irepository
//Ayrıca aynızamanda class extend edilevekse bu şekidle yazılır
public class MySqlCustomerDal implements ICustomerDal, Irepository{

    @Override
    public void Add() {

        System.out.println("sql eklendi");

    }
}
