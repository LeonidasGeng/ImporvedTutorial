package _02.UDP;

import java.io.IOException;
import java.net.*;

/*
UDP user datagram protocol
        速度要求高，数据完整性要求不高（直播/语音通话/视频会话）
        相当于寄快递
        发送端 ---xxxxxxxxxxx--- 接收端
            不需要链接
            速度快
            一次性最多发64k, 多余64k会发多个包
            易丢失数据
发送端 API：DatagramSocket()
    1，创建发送端
    2，创建一个数据包
    3，发送数据包
接收端 API: DatagramSocket(int port)
    1.创建接收端
    2，创建空的数据包
    3，接收数据

InetAddress.getLocalHost() 获取本机的IP
InetAddress.getByName("192.168.75.96") 别人的IP地址
 */
public class demo02_Send {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动");
        //发送端 API：DatagramSocket()

        //    1，创建发送端
        DatagramSocket socket = new DatagramSocket();

        //    2，创建一个数据包
            // buf – the packet data. 要发送的数据的字节数组
            // offset – the packet data offset. 从数组哪个位置开始发
            // length – the packet data length. 发送多少数据
            // address – the destination address, or null. 接收方的IP地址
            // port – the destination port number. 接收方的端口
        byte[] bytes = "您好，UDP".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length, InetAddress.getLocalHost(),9527);

        //    3，发送数据包
        socket.send(packet);

        System.out.println("发送端发送成功");

        socket.close();
    }
}
