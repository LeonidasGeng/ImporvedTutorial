package _08.Synchronized_Method_同步方法;

/*
电影院
3个窗口
100张票

思路：
1，定义一个SaleTicket继承Thread类
2，定义一个SaleTicket类重写run()方法实现卖票
    2.1判断票数大于0，就卖一张票，票数-1
    2.2判断票=0，结束卖票
3，定义一个测试类TicketDemo，里面有main方法
    3.1创建3个SaleTicket类的对象（三个窗口）
    3.2启动线程

线程安全问题
    多个线程同时操作共享资源导致数据错乱，称为线程安全问题
原因
    1，多线程并发
    2，同时访问共享资源
    3，存在修改共享资源

线程同步思想
保证线程安全
    多个线程不要同时执行卖票逻辑，而是先后执行卖票逻辑

线程同步的核心思想
    加锁，把共享资源进行上锁，每次只能一个线程进入，操作完毕后解锁，然后其他线程才能进来

线程同步
    1，同步代码块
    2，同步方法
    3，Lock锁

2.同步方法
格式
public synchronized void 方法名() {
    //操作共享资源的代码
}

作用
给方法解锁，解决线程安全问题

 */
public class demo08 {
    public static void main(String[] args) {
        //创建3个线程表示3个窗口
        SaleTicket st1 = new SaleTicket();//100
        SaleTicket st2 = new SaleTicket();//100
        SaleTicket st3 = new SaleTicket();//100

        //启动3个线程
        st1.start();
        st2.start();
        st3.start();
    }
}
