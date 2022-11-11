package com.itheima.demo03多态的案例_重点;

/*
系统需求
Usb鼠标具有:插入，拔出，点击功能
Usb键盘具有:插入，拔出，敲击功能
面向对象思想设计一个电脑，可以使用各种Usb设备(插入，特有功能，拔出)

分析实现
    1.定义一个USB的接口（插入和拔出功能）。
    2.定义Usb鼠标和Usb键盘，并完善相应功能。
    3.定义电脑使用Usb设备
 */
public class Demo03 {
    public static void main(String[] args) {
        // 创建Usb鼠标
        UsbMouse mouse = new UsbMouse();

        // 创建Usb键盘
        UsbKeyboard keyboard = new UsbKeyboard();

        // 创建电脑
        Computer computer = new Computer();

        // 创建电脑使用Usb设备
        computer.useUsb(mouse);
        System.out.println("--------------------");
        computer.useUsb(keyboard);
    }
}



