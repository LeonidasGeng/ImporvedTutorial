package _05.Thread_Sleep_or_Hibernate;
/*
sleep 让线程休眠指定时间，单位为毫秒
 */
public class demo05 {
    public static void main(String[] args) throws InterruptedException {
        //让程序等待1000毫秒后运行
        //不能写负数，报错，异常
        Thread.sleep(1000);//1000毫秒=1秒
        System.out.println('a');
        Thread.sleep(1000);//1000毫秒=1秒
        System.out.println('b');
        Thread.sleep(1000);//1000毫秒=1秒
        System.out.println('c');
        Thread.sleep(1000);//1000毫秒=1秒
        System.out.println('d');
        Thread.sleep(1000);
        //拓展，倒计时， 10.forr   forr逆序
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
