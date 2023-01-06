package _05.TCP_Upload_Files_MultThreads;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadRunnable implements Runnable {
    //成员变量
    private Socket socket;
    //构造器给成员变量赋值
    public UploadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
        //开始上传的代码写到新线程中
        System.out.println(socket.getRemoteSocketAddress()+"开始上传");//getRemoteSocketAddress 知道是谁上传（IP地址）
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
        fos.close();}
        catch(Exception e){
         System.out.println("文件上传失败: "+e.toString());
        }
    }
}
