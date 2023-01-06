package _05.TCP_Upload_Files_MultThreads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/*
服务端要做的事情
    1 创建服务端
    2 同意客户端的链接
    3 getInputStream 得到输入流读数据
    4 创建文件输入流读取文件数据
    5 getOutputStream 得到输出流写数据

解决上传文件重名问题
        String fileName = UUID.randomUUID().toString();
多人上传
    循环同意accept, 并传输数据
 */
public class demo05_Server {
    public static void main(String[] args) throws IOException {
        //    1 创建服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            //    2 同意客户端的链接
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"开始上传");
            //    3 getInputStream 得到输入流读数据
            InputStream in = socket.getInputStream();
            //    4 创建文件输入流读取文件数据
        /*
        //     1 时间戳
        long fileName = System.currentTimeMillis();
               2 随机名字
        String fileName = UUID.randomUUID().toString();
        */
            FileOutputStream fos = new FileOutputStream("Day011/test/test02");
            //    5 循环读写数据
            byte[] bytes = new byte[1024 * 8];//保存读取的数据
            int len;//保存读取的数量
            while ((len = in.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            System.out.println(socket.getRemoteSocketAddress()+"服务端接收完成");
            //    6 getOutputStream 得到输出流写数据
            OutputStream out = socket.getOutputStream();
            out.write("上传完成".getBytes());
            //    7 关闭
            out.close();
            in.close();
            fos.close();
            //socket.close(); 服务器不需要关闭
        }

    }
}
