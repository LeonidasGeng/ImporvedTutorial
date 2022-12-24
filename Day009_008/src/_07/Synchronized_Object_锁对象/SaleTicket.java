package _07.Synchronized_Object_锁对象;

public class SaleTicket extends Thread{
    private static int ticketNumber = 100;
    private static Object obj = new Object();//锁对象必须是唯一的/相同的
    @Override
    public void run() {
        while (true) {
            //           👇锁对象
            synchronized (obj){
                //判断票数大于0，就卖一张票，票数-1
                if (ticketNumber>0) {
                    try {
                        Thread.sleep(30);//方便查看多线程卖票问题
                    }catch (InterruptedException e) {}

                    ticketNumber--;//卖一张票
                    System.out.println(getName()+" 卖了一张票，剩余："+ticketNumber+" 张票");
                }else {
                    //判断票等于0，结束卖票
                    break;
                }
            }
        }
    }
}
