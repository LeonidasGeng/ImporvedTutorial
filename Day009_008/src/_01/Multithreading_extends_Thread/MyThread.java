package _01.Multithreading_extends_Thread;
/*
1，定义类继承Thread类
 */
public class MyThread extends Thread{
    //默认调用父类run方法，不需要，删掉
    //2，重写run方法
    @Override
    public void run() {
        for (int i = 0; i <20;i++)  {
            System.out.println("run: " + i);
        }
    }
}
