package _04.TCP_Upload_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
客户端要做的事情
    1 创建客户端
    2 自动连接至服务端
    3 创建文件输入流读取文件数据
    4 getOutputStream得到输出流写数据
    5 getInputStream得到输入流读数据
 */
public class demo04_Client {
    public static void main(String[] args) throws IOException {
        //    1 创建客户端
        Socket socket = new Socket("127.0.0.1", 9999);

        //    2 创建文件输入流读取文件数据
        FileInputStream fis = new FileInputStream("Day011/test/test01.txt");

        //    3 getOutputStream得到socket的输出流写数据
        OutputStream out = socket.getOutputStream();

        //    4 循环读写数据
        byte[] bytes = new byte[1024*8]; //保存读取的数据
        int len = fis.read(bytes); //保存读取的数量
        while ((len = fis.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        System.out.println("客户端发送文件完成！");
        socket.shutdownOutput();//让客户端socket的输出流结束
        //    5 getInputStream得到输入流读数据
        InputStream in = socket.getInputStream();
        len = in.read(bytes);
        System.out.println("客户端收到："+new String(bytes,0,len));

        //  6 关闭资源
        in.close();
        out.close();
        fis.close();
        socket.close();
    }
}
