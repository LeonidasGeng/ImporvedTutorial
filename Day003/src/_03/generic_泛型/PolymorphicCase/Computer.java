package _03.generic_泛型.PolymorphicCase;

public class Computer {
    //有使用各种USB设备的功能
    //参数写接口，多态形式，可以传入任意实现类，拓展性强
    public void useUSB(USB u){
        //链接
        u.connect();
        //断开
        //调用USB设备的特有功能

        if(u instanceof USBMouse){
            //判断，如果是USB鼠标，就调用USB鼠标的特有功能
            USBMouse um = (USBMouse) u;
            um.click();
        } else if (u instanceof USBKeyboard) {
            //判断，如果是USB键盘，就调用USB键盘的特有功能
            USBKeyboard uk = (USBKeyboard) u;
            uk.type();
        }
        u.disconnect();

    }
        }


