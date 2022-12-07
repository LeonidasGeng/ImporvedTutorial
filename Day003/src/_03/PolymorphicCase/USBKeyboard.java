package _03.PolymorphicCase;

public class USBKeyboard implements USB{
    public void connect(){
        System.out.println("USB键盘已链接");
    }
    public void disconnect(){
        System.out.println("USB键盘已断开");
    }
    public void type(){
        System.out.println("USB键盘已敲击");
    }
}
