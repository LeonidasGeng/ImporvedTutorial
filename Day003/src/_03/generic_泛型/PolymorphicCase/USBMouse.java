package _03.generic_泛型.PolymorphicCase;

public class USBMouse implements USB{
    @Override
    public void connect(){
        System.out.println("USB鼠标已链接");
    }
    @Override
    public void disconnect(){
        System.out.println("USB鼠标已断开");
    }
    public void click(){
        System.out.println("USB鼠标已点击");
    }
}
