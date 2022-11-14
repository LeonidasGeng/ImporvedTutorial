package com.itheima._03多态的案例_重点;

public class USBKeyboard implements USB{
    //常规功能1，插入/链接
    @Override
    public void connect() {
            System.out.println("USB键盘连接成功");
        }
    //常规功能2，拔出/断开
    @Override
    public void disconnect() {
        System.out.println("USB键盘已断开");
    }

    //特有功能，敲击
    public static void type(){
        System.out.println("USB键盘点了一下");
    }

}
