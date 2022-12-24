package _08.Synchronized_Method_同步方法;

public class SaleTicket extends Thread{
    private static int ticketNumber = 100;
    @Override
    public void run() {
        //判断票数大于0，就卖一张票，票数-1
        while (true) {
            sale();
            if (ticketNumber==0) {
                break;//没有票，结束
            }

        }
    }

    //普通的同步方法使用this作为锁
    //静态同步方法使用类名.class作为锁，类名.class是唯一的

    //锁住了方法
    //卖一张票的方法
    public static synchronized void sale() {
//        System.out.println("this: " + this); //普通的同步方法使用this作为锁
//        System.out.println("静态同步方法的锁: " + SaleTicket.class);
        if (ticketNumber>0) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
            ticketNumber--;//卖一张票

            System.out.println(Thread.currentThread().getName()+" 卖了一张票，剩余："+ticketNumber+" 张票");
        }
        }
    }


