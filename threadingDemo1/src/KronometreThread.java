public class KronometreThread  implements Runnable {
//standart kod
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("olusturuluyor"+threadName);
    }

    @Override
    //buranın içine yazılan kod thread seklınde clısıcaktır
    //bizim içini kullanacagımız kod bu
    public void run() {
        System.out.println("calistiriliyor"+threadName);

       try  {
           for (int i = 1; i <=10 ; i++) {
               System.out.println(threadName+":"+i);
               Thread.sleep(1000);//1 saniye bekletme
           }
       }catch (InterruptedException exception){
           System.out.println("kesildi");
       }

       System.out.println("Thread bitti");


    }
    //standart kod
    public void start(){
        System.out.println("thread nesnesi olusturuluyor");
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
