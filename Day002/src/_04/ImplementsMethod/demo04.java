package _04.ImplementsMethod;
/*
接口中都是抽象方法
行为规范，约束一类事物的功能设计
为后续软件设计，提高程序的扩展性

格式
interface 接口名{
    成员变量
    抽象方法
}

使用
class 实现类 implements 接口1，接口2{
    ......
}


案例
USB案例

USB接口，包含
连接电脑，传输数据，断开链接
USB鼠标实现USB接口
USB键盘时间USB接口

接口中的所有变量都是常量，多个单词之间用_链接
public static final STDUNET_COUNT= 10;
ctrl+shift+u 切换大小写


接口中的方法默认是抽象方法
void connect();
    //传输数据
    //接口中的方法默认是抽象方法
    //public abstract// void sendData();
 */
public class demo04 {
    public static void main(String[] args) {
        //接口不能创建对象
        //USB usb = new USB;
        USBMouse usbMouse = new USBMouse();
        usbMouse.connect();
        usbMouse.sendData();
        usbMouse.disConnect();
        System.out.println("=============================");
        USBKeyboard usbKeyboard = new USBKeyboard();
        usbKeyboard.connect();
        usbKeyboard.sendData();
        usbKeyboard.disConnect();
    }
}
