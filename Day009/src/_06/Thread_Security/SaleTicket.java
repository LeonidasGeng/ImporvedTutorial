package _06.Thread_Security;

public class SaleTicket extends Thread{
    private static int ticketNumber = 100;
    @Override
    public void run() {
        //判断票数大于0，就卖一张票，票数-1
        while (true) {
            if (ticketNumber>0) {
                ticketNumber--;//卖一张票
                System.out.println(getName()+" 卖了一张票，剩余："+ticketNumber+" 张票");
            }else {
                //判断票等于0，结束卖票
                break;
            }

        }
        //判断票=0，结束卖票
    }


}
