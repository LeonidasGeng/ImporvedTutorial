package _02.Multithreading_implements_Runnable;

//1，定义类实现Runnable方法
public class MyRunnable implements Runnable {
    //2，重写run方法
    @Override
    public void run() {//新线程会执行run方法，run方法中的代码称为任务
        for (int i = 0; i < 20; i++) {
            System.out.println("run: " + i);
        }
    }
}
