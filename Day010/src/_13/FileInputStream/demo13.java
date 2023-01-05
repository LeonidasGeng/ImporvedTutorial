package _13.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
inputStream是抽象的，用它的子类FileInputStream操作文件
int read() 从流中读取一个字节，返回读取的字节数据
int read(byte[] b) 从流中读取多个字节保存参数的数组中

 */
public class demo13 {
    public static void main(String[] args) throws IOException {
        //1 创建字节输入流对象
        FileInputStream fis = new FileInputStream("Day010\\test01\\test02.txt");
/*
        //2 读取一个字节数据(默认从第一个字节的数据读起，读过了就再读下一个)
        int a = fis.read();
        System.out.println(a);//72
        System.out.println((char)a);//H
        a = fis.read();
        System.out.println((char)a);//e
        a = fis.read();
        System.out.println((char)a);//l
        a = fis.read();
        System.out.println((char)a);//l
        a = fis.read();
        System.out.println((char)a);//o

        //......
        //文件中没有内容了，返回-1
        //重复太多
        //可以用while循环

 */
        int a;
        while ((a = fis.read() )!= -1) {
            System.out.print((char) a);
        }

        //3 关闭
        fis.close();
    }
}
