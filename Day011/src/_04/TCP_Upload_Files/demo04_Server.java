package _04.TCP_Upload_Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务端要做的事情
    1 创建服务端
    2 同意客户端的链接
    3 getInputStream 得到输入流读数据
    4 创建文件输入流读取文件数据
    5 getOutputStream 得到输出流写数据
 */
public class demo04_Server {
    public static void main(String[] args) throws IOException {
        //    1 创建服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        //    2 同意客户端的链接
        Socket socket = serverSocket.accept();
        //    3 getInputStream 得到输入流读数据
        InputStream in = socket.getInputStream();
        //    4 创建文件输入流读取文件数据
        FileOutputStream fos = new FileOutputStream("Day011/test/test02");
        //    5 循环读写数据
        byte[] bytes = new byte[1024 * 8];//保存读取的数据
        int len;//保存读取的数量
        while ((len = in.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        System.out.println("服务端接收完成");
        //    6 getOutputStream 得到输出流写数据
        OutputStream out = socket.getOutputStream();
        out.write("上传完成".getBytes());
        //    7 关闭
        out.close();
        in.close();
        fos.close();
        socket.close();
    }
}
