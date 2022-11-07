package _02staticForMemberVariables;

/*
    一个电影院卖票，100张票，两个窗口负责

 */
public class demo01 {
/*
    public class window{
        public String moiveName;
        public static int ticketNumber;
    }

    //static修饰成员变量的调用
    //推荐：
    int salesNumber = window.ticketNumber;

    //static 使用场景说明
    //1，某个成员变量希望被共享
    //例如：学校饮水机

    //如果某个成员变量是属于每个对象的，且每个对象的该数据之的不同则定义成实例成员变量
    //例如：每个人的laptop
*/

    public static void main(String[] args) {
        //window类打印票数
        window.ticketNumber=100;
        System.out.println("电影院现有"+window.ticketNumber+"张票");
        //创建窗口1
        window w1 = new window("窗口1",100);
        //窗口1：打印票数
        System.out.println("窗口1有票"+window.ticketNumber+"张");
        //创建窗口2
        window w2 = new window();
        w2.windowName="窗口2";
        //窗口2：打印票数
        System.out.println("窗口2有票"+window.ticketNumber+"张");
        //窗口1卖出一张票
        w1.ticketNumber --;
        System.out.println("卖出1张票后");
        //窗口1：打印票数
        System.out.println("窗口1有票"+window.ticketNumber+"张");
        //窗口2：打印票数
        System.out.println("窗口2有票"+window.ticketNumber+"张");
        //window类打印票数
        System.out.println("还剩"+window.ticketNumber+"张票");
    }
}
