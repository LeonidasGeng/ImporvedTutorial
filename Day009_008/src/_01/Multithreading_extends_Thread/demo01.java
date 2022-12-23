package _01.Multithreading_extends_Thread;
/*
实现多线程方式
1，继承Thread类
Thread类表示线程，通过Thread类启动多个线程

Thread类启动步骤
1，定义类 继承Thread类
2，重写run方法 ，编写新线程要执行的代码，新线程是用来封装被线程执行的代码
3，创建Thread的子类对象
4. 调用start()方法 启动新线程，新线程自动执行run()方法

输出结果：
CPU在多个线程间随即切换
多次运行显示的结果可能不一样

优点：
代码简单

缺点：
线程已继承Thread类，无法继承其他类，不利于扩展

 */
public class demo01 {
    public static void main(String[] args) {
//        3，创建Thread的子类对象
//        for (int i = 0; i < 20; i++) {
//            System.out.println("main " + i);
//        }
//        👆先执行这个for循环，main()方法，没有启动新线程
        MyThread mt = new MyThread();
        //4，启动新线程
        mt.start();
        //如果是mt.run()，执行完了run()方法再进行下面的main，没有启动新线程，是普通的方法调用

        for (int i = 0; i < 20; i++) {
            System.out.println("main " + i);
        }
    }
}
