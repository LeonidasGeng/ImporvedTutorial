package _03Interface;

public interface USB {
    //链接电脑
    public abstract void connect();
    //传输数据
    public abstract void sendData();
    //断开链接
    public abstract void disconnect();

    
}
