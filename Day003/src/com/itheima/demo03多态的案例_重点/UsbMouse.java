package com.itheima.demo03多态的案例_重点;

public class UsbMouse implements Usb {
    @Override
    public void connect() {
        System.out.println("Usb鼠标连接啦!");
    }

    @Override
    public void disConnect() {
        System.out.println("Usb鼠标断开啦!");
    }

    // 特有方法(点击)
    public void click() {
        System.out.println("Usb鼠标点击啦!!!!!!!!!!!!!");
    }
}
