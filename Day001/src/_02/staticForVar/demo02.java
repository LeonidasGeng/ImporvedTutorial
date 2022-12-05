package _02.staticForVar;

public class demo02 {
    public static void main(String[] args) {
        //Window类打印票数
        Window.ticketNumber = 100;
        System.out.println(Window.ticketNumber);
        //创建窗口1
        Window w1 = new Window();
        w1.name = "窗口1";
//        w1.ticketNumber = 100;
        //窗口1打印票数
        System.out.println("窗口1有"+w1.ticketNumber+"张票");

        //创建窗口2
        Window w2 = new Window();
        w2.name = "窗口2";

        //窗口1打印票数
        System.out.println("窗口2有"+w2.ticketNumber+"张票");

        //窗口1卖一张票
        w1.ticketNumber --;
        //窗口1打印票数
        System.out.println("窗口1卖了一张票后，窗口1还有"+w1.ticketNumber+"张票");
        //窗口2打印票数
        System.out.println("窗口1卖了一张票后，窗口2还有"+w2.ticketNumber+"张票");
        //Window类打印票数
        System.out.println("还有"+Window.ticketNumber+"张票");
    }

}
