package _04.get_current_thread;

public class NamedThread extends Thread{
    //run+回车
    @Override
    public void run() {
        System.out.println("线程名称："+getName());//子类直接调用父类方法
        String gn = Thread.currentThread().getName();
        System.out.println("run方法线程: "+gn);
    }

    //Generate---Constructor---Thread(name:String)
    public NamedThread(String name) {
        super(name);//找Thread类中 Thread(String name)

    }
}
