package com.itheima.demo03多态的案例_重点;

public class UsbKeyboard implements Usb {
    @Override
    public void connect() {
        System.out.println("Usb键盘连接啦!");
    }

    @Override
    public void disConnect() {
        System.out.println("Usb键盘断开啦!");
    }

    // 特有功能(敲击)
    public void type() {
        System.out.println("Usb键盘敲击啦!!!!!!");
    }
}
