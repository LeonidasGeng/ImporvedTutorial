package com.itheima._03多态的案例_重点;

/*USB 接口

 */
public abstract interface USB {
    //插入
    public abstract void connect();
    //拔出/断开
    public abstract void disconnect();

}
