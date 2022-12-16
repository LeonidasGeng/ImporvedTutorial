package _04.ImplementsMethod;

public class USBKeyboard implements USB{
    @Override
    public void connect() {
        System.out.println("USB键盘已连接");
    }

    @Override
    public void sendData() {
        System.out.println("USB键盘已发送数据");
    }

    @Override
    public void disConnect() {
        System.out.println("USB键盘已断开");
    }
}
