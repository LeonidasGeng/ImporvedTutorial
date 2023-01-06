package _03.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
TCP Socket 客户端
TCP ServerSocket 服务端
    1, 创建服务端
    2, 创建客户端
    ===客户端自动连接服务端===
    3, 同意客户端的链接
    4, getOutStream
 */
public class demo03_TCP_Client {
    //编写TCP客户端
    //1，创建客户端
    //2，
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        //1, 创建客户端，链接127.0.0.1，和电脑的10086端口
        // host – the host name, or null for the loopback address.
        // port – the port number.
        Socket socket = new Socket("127.0.0.1",10086);

        //2, 得到输出流写数据
        OutputStream out = socket.getOutputStream();
        out.write("Hello World!!\n".getBytes());

        //3, 得到输入流读取数据
        InputStream in = socket.getInputStream();
        byte[] buf = new byte[1024];//储存读取的数据
        int len = in.read(buf);
        System.out.println("客户端收到："+new String(buf,0,len));

        //4, 关闭资源
        socket.close();
        in.close();
        out.close();
    }
}
