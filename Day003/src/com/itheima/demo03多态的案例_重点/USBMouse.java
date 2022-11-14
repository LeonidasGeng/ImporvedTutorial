package com.itheima.demo03多态的案例_重点;
/*USB鼠标实现USB接口功能

 */
public class USBMouse implements USB{
    //常规功能1，插入/链接
    @Override
    public void connect() {
        System.out.println("USB鼠标连接成功");
    }
    //常规功能2，拔出/断开
    @Override
    public void disconnect() {
        System.out.println("USB鼠标已断开");
    }
    //特有功能
    public static void click(){
        System.out.println("USB鼠标点了一下");
    }
}
