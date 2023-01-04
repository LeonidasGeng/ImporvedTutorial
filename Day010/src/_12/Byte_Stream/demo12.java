package _12.Byte_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Byte
    字节输入InputStream
    字节输出OutputStream

    void write(int value)
 */
public class demo12 {
    public static void main(String[] args) throws IOException {
        //1, 创建一个文件字节输出流
        FileOutputStream fos = new FileOutputStream("Day010\\test01\\test01.txt");

        //2, 写数据
        //void write(int value) 写一个字节到文件中
        fos.write(97);
        fos.write(98);

        //3, 关闭
        fos.close();

        byte[] bytes={1,2,3,4,5};
    }
}
