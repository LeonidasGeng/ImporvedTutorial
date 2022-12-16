package _04.ImplementsMethod;
//实现类
//            USB鼠标  实现       USB接口
public class USBMouse implements USB{
    @Override
    public void connect() {
        System.out.println("USB鼠标已链接");
    }

    @Override
    public void sendData() {
        System.out.println("USB鼠标已发送数据");
    }

    @Override
    public void disConnect() {
        System.out.println("USB鼠标已断开");
    }
}
