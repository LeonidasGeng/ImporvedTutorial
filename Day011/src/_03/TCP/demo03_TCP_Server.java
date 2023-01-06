package _03.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo03_TCP_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动");
        //1, 创建服务端，链接127.0.0.1，和电脑的10086端口
        // host – the host name, or null for the loopback address.
        // port – the port number.
        ServerSocket serverSocket = new ServerSocket(10086);

        //2, 同意客户端的请求，如果没有客户端链接就一直等
        Socket socket = serverSocket.accept();

        //3, 得到输入流读取数据
        InputStream in = socket.getInputStream();
        byte[] buf = new byte[1024];//储存读取的数据
        int len = in.read(buf);//没有数据回一直等
        System.out.println("服务端收到："+new String(buf,0,len));

        //4，得到输出流写数据
        OutputStream out = socket.getOutputStream();
        out.write("Hello World!".getBytes());
        //4, 关闭资源
        socket.close();
        in.close();
        serverSocket.close();
        out.close();
    }
}
