package _03Interface;
/*          实现类（子类）
               USB       实现     USB接口
 */
public class USBMouse implements USB{
    @Override
    public void connect() {
        System.out.println("USB鼠标已连接");
    }

    @Override
    public void sendData() {
        System.out.println("USB鼠标发送数据");
    }

    @Override
    public void disconnect() {
        System.out.println("USB鼠标已断开连接");
    }
}
