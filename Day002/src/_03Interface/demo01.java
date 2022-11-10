package _03Interface;
/*
格式：
class 类名 implements 接口{
}
 */
public class demo01 {
    public static void main(String[] args) {
        //接口不能创建对象
//        USB Usb = new USB();无法创建对象

        //创建USB鼠标
        USBMouse um = new USBMouse();
        um.connect();
        um.sendData();
        um.disconnect();
        //创建USB键盘
        USBKeyboard uk = new USBKeyboard();
        uk.connect();
        uk.sendData();
        uk.disconnect();


    }
}
