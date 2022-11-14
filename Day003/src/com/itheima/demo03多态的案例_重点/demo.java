package com.itheima.demo03多态的案例_重点;
/*
USB 鼠标 ： 插入，拔出，点击功能
USB 键盘 ： 插入，拔出，敲击
电脑 ： 插入，特有功能，拔出

定义USB接口
定义鼠标，键盘
电脑使用USB设备

 */
public class demo {
    public static void main(String[] args) {
        //创建USB鼠标
        USBMouse mouse = new USBMouse();

        //创建USB键盘
        USBKeyboard keyboard = new USBKeyboard();
        //创建USB电脑
        Computer computer = new Computer();
        computer.useUSB(mouse);
        computer.useUSB(keyboard);
        //电脑使用USB设备

    }

}
