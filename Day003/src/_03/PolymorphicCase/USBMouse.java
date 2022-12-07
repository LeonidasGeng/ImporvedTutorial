package _03.PolymorphicCase;

public class USBMouse implements USB{
    public void connect(){
        System.out.println("USB鼠标已链接");
    }
    public void disconnect(){
        System.out.println("USB鼠标已断开");
    }
    public void click(){
        System.out.println("USB鼠标已点击");
    }
}
