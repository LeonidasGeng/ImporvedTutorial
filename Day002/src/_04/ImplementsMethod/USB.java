package _04.ImplementsMethod;

public interface USB {
    //连接电脑
    //接口中的方法默认是抽象方法
    void connect();
    //传输数据
    //接口中的方法默认是抽象方法
    /*public abstract*/ void sendData();
    //断开连接
    public abstract void disConnect();
}
