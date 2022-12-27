package _04.get_current_thread;
/*
Thread类
    构造器
        Thread(String name) 创建线程对象是，设置线程的名称
    普通方法
        String getName() 获取线程名字
        void setName(String name) 设置线程名字

    默认线程名称为 Thread-0
 */
public class demo04 {
    public static void main(String[] args) {
        //获取当前线程
        String gn = Thread.currentThread().getName();
        System.out.println("main方法线程: "+gn);//结果：main    调用主线程
        //Thread t = Thread.currentThread();
        //System.out.println(t.getName());
        NamedThread nt = new NamedThread("设置线程: 初号线程2");
        //修改线程名字
//        nt.setName("初号线程1");
        nt.start();
        //不能调用两次start();
        //想启动新线程需要再创建对象去调用
        //NamedThread nt2 = new NamedThread();
        //        nt2.start();



    }
}
