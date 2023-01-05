package _02.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
要先启动接收端
 */
public class demo02_Receive {
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动");
        //发送端 API：DatagramSocket()

        //    1，创建接收端
        DatagramSocket socket = new DatagramSocket(9527);

        //    2，创建空的数据包
        // byte buf[]– buffer for holding the incoming datagram. 用来保存数据的数组
        // int length – the number of bytes to read. 一次能接受多少数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //    3，接收数据包
        socket.receive(packet);
        int length = packet.getLength();
        System.out.println("接收端收到"+ new String(buf,0,length));
        System.out.println("接收端接收成功");

        socket.close();
    }
}
