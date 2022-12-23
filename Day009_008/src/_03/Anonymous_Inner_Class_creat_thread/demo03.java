package _03.Anonymous_Inner_Class_creat_thread;
/*
方法参数是接口
传入匿名内部类对象
 */
public class demo03 {
    public static void main(String[] args) {
        //Thread(Runnable r)
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("匿名内部类创建线程1");
            }
        });
        t1.start();
        //结果：匿名内部类创建线程1

        //new Thread(xxx).start();
        //new Thread(new Runnable 回车).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程2");
            }
        }).start();
        //结果：
        //匿名内部类创建线程1
        //匿名内部类创建线程2

        //Lambda表达式new Thread(()->{}).start();
        new Thread(()->{
            System.out.println("匿名内部类创建线程3");
        }).start();
        //结果
        //匿名内部类创建线程1
        //匿名内部类创建线程2
        //匿名内部类创建线程3

        //快捷：匿名内部类idea自动换成Lambda表达式
        /*
                        👇alt+回车，replace with lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程2");
            }
        }).start();


         */

    }
}
