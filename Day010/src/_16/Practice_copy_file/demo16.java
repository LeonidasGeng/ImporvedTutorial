package _16.Practice_copy_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
复制文件的本质：
    两个文件的内容要一样

步骤
    1，创建输入流
    2，创建输出流
    3，循环读写数据
    4，关闭流
 */
public class demo16 {
    //目标，将test02.txt的内容复制到test02_copy.txt
    public static void main(String[] args) throws IOException {
        //1 创建文件字节输入流
        FileInputStream fis = new FileInputStream("Day010\\test01\\test02.txt");
        //2 创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("Day010/test01/test02_copy.txt");

        //3 循环读写
        byte[] bytes = new byte[1024 * 8];//保存每次读写的数据，水杯
        int len;
        while ((len = fis.read(bytes)) != -1) {
            //读到数据，写到另一个文件
            fos.write(bytes, 0, len);
        }

        //4 关闭流
        fos.close();
        fis.close();
    }
}
