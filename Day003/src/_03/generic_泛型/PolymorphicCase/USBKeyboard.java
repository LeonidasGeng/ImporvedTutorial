package _03.generic_泛型.PolymorphicCase;

public class USBKeyboard implements USB{
    @Override
    public void connect(){
        System.out.println("USB键盘已链接");
    }
    @Override
    public void disconnect(){
        System.out.println("USB键盘已断开");
    }
    public void type(){
        System.out.println("USB键盘已敲击");
    }
}
