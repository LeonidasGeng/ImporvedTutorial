package _05.TCP_Upload_Files_MultThreads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

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
多人同时上传
    使用多线程
    线程池
 */
public class demo05_Server_mt {
    public static void main(String[] args) throws IOException {
        //    1 创建服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        //    创建线程池
        ExecutorService pool = newFixedThreadPool(10);
        //一直等待别人链接，上传不是一次性的
        while (true) {
            //    2 同意客户端的链接
            Socket socket = serverSocket.accept();
            UploadRunnable up = new UploadRunnable(socket);
            //提交任务到线程池
            pool.submit(up);
        }
        //socket.close(); 服务器不需要关闭
    }
}
