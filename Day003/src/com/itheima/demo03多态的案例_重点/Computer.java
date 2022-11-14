package com.itheima.demo03多态的案例_重点;

public class Computer {
/*
电脑使用各种USB设备,参数写接口，多态形式，可以传入任意实现类，扩展性强
 */
    public void useUSB(USB usb){
        usb.connect();
        //调用USB设备特有功能
        //做判断，如果是USB鼠标，就调用USBMouse特有功能
        //做判断，如果是USB键盘，就调用USBKeyboard特有功能
        if(usb instanceof USBMouse){
            USBMouse um = (USBMouse) usb;
            um.click();
        } else if (usb instanceof USBKeyboard) {
            USBKeyboard uk = (USBKeyboard) usb;
            uk.type();
        }
        usb.disconnect();

    }
}
