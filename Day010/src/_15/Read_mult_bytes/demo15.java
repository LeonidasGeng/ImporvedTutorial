package _15.Read_mult_bytes;

import java.io.FileInputStream;
import java.io.IOException;

/*
int read(byte[] b) 从输入流读取一个字节数组，返回读取的数量

 */
public class demo15 {
    public static void main(String[] args) throws IOException {
        //文中的数据 Hello World
        //      第一次 第二次 第三次
        //读取到的数据
        //a数组中的数据
        /*
        FileInputStream fis = new FileInputStream("Day010/test01/test02.txt");
        byte[] b = new byte[3];//这个数组用于保存每次读取的数据，相当于水杯
        int len = fis.read(b);
        System.out.println(new String(b));//Hel
        System.out.println(len);//3

        len = fis.read(b);
        System.out.println(new String(b));//lo
        len = fis.read(b);
        System.out.println(new String(b));//Wor
        len = fis.read(b);
        System.out.println(new String(b));//ldr


        */
        FileInputStream fis = new FileInputStream("Day010/test01/test02.txt");
        byte[] b = new byte[3];//这个数组用于保存每次读取的数据，相当于水杯

        int len;//保存读取的数量
        while (((len = fis.read(b)) != -1)) {
            System.out.print(new String(b,0,len));
        }
        fis.close();
    }
}
