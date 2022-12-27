package _09.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket extends Thread{
    private static int ticketNumber = 100;//要卖的100张票
    private static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            //创建Lock锁,获取锁（加锁）
            lock.lock();
            try {
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
            } finally {
                //结束，释放锁
                lock.unlock();
            }

        }

    }


}
