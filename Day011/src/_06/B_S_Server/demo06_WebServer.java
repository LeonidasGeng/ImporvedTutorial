package _06.B_S_Server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
模拟网站服务器
网站服务器TCP服务端，将来返回数据给浏览器（TCP客户端）
 */
public class demo06_WebServer {
    public static void main(String[] args) throws IOException {
        System.out.println("AWS服务器启动了");
        //1 创建TCP服务端
        ServerSocket serverSocket = new ServerSocket(9527);
        while (true) {
            //2 同意客户端的请求
            Socket socket = serverSocket.accept();

        //3 返回数据给浏览器（TCP客户端） HTTP有固定回复的
        //OutputStream out = socket.getOutputStream();
        //out.write("HTTP/1.1 200 OK\r\n".getBytes());
        //out.write("Content-Type:text/html\r\n".getBytes());
        //out.write("\r\n".getBytes());
        OutputStream out = socket.getOutputStream();
        out.write("HTTP/1.1 200 OK\r\n".getBytes()); //告诉浏览器一切正常
        out.write("Content-Type:text/html; charset=utf-8\r\n".getBytes()); //告诉浏览器返回的是一个html网页，并且是utf-8编码
        out.write("\r\n".getBytes());

        //4 下面这些内容回在浏览器上显示
        out.write("<h1>欢迎来到AWS服务器".getBytes()); //告诉浏览器一切正常
        out.close();
        }
    }
}
