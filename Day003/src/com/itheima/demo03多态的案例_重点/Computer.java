package com.itheima.demo03多态的案例_重点;

public class Computer {
    // 使用各种Usb设备, 参数写接口,多态形式,
    // 可以传入任意实现类,扩展性强
    public void useUsb(Usb u) {
        u.connect();
        // 调用Usb设备的特有功能
        //判断
        if (u instanceof UsbMouse) {
            // 如果是Usb鼠标,调用Usb鼠标的特有功能
            UsbMouse um = (UsbMouse)u;
            um.click();
        } else if (u instanceof UsbKeyboard) {
            // 如果是Usb键盘,调用Usb键盘的特有功能
            UsbKeyboard uk = (UsbKeyboard) u;
            uk.type();
        }
        u.disConnect();
    }
}
