package _03.generic_泛型.PolymorphicCase;
/*
USB鼠标：插入，拔出，点击
USB键盘：插入，拔出，敲击

定义一个USB接口（插入，拔出）
定义电脑使用USB设备

 */
public class demo03 {
    public static void main(String[] args) {
        //创建USB鼠标
        USBMouse mouse = new USBMouse();

        //创建USB键盘
        USBKeyboard keyboard = new USBKeyboard();

        //创建电脑
        Computer computer = new Computer();

        //电脑使用USB设备
        computer.useUSB(mouse);
        System.out.println("====================");
        computer.useUSB(keyboard);

    }
}
