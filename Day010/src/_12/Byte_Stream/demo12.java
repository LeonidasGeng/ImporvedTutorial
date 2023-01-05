package _12.Byte_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Byte
    字节输入InputStream
    字节输出OutputStream

    void write(int value)

    I/O 流路径不能写文件夹
    patent path要存在

 */
public class demo12 {
    public static void main(String[] args) throws IOException {
        //1, 写单个字节
        //1.1, 创建一个文件字节输出流
        FileOutputStream fos = new FileOutputStream("Day010\\test01\\test01.txt");

        //1.2, 写数据
        //void write(int value) 写一个字节到文件中
        fos.write(97);
        fos.write(98);

        //1.3, 关闭
        fos.close();


        //2, 写多个字节
        byte[] bytes={1,2,3,4,5};
        //2.1 void write(byte[] value)写字节数组的全部到流中
        fos.write(bytes);

        //2.2 void write(byte[] value, int off, lnt len)写字节数组的一部分到流中
        //int off: offset 从数组哪个位置开始写
        //int len: length 写多少个
        fos.write(bytes, 0, bytes.length);
        fos.write(bytes, 1, 3);

        //2.3, 关闭
        fos.close();


    }
}
