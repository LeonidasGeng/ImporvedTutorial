package _02.Multithreading_implements_Runnable;
/*
步骤
              👇叫啥都行
1，定义一个类（MyRunnable）实现Runnable接口
2，在MyRunnable类中重写run()方法
3，创建Runnable实现类对象
4，创建Thread类，传入Runnable实现类对象
5，启动新线程, 调用start();

优点：
可以继承类和实现接口，扩展性强
缺点：
代码复杂一点，需要创建两个对象
 */
public class demo02 {
    public static void main(String[] args) {
        //3，创建Runnable实现类对象
        MyRunnable mr = new MyRunnable();

        //4，创建Thread类，传入Runnable实现类对象
        Thread t = new Thread(mr);
        //5，启动新线程
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }

    }


}
