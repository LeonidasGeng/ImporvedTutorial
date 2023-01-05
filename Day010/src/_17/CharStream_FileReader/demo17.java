package _17.CharStream_FileReader;

import java.io.FileReader;
import java.io.IOException;

/*
字符流
Reader/Writer

FileReader
文件中的数据读取到程序中
int read() 从流中读取一个字符
int read(char b) 从流中读取多个字符保存参数的数组中

FileWriter
程序中的数据读取到文件中
 */
public class demo17 {
    public static void main(String[] args) throws IOException {
        /*
        //字符流读取一个字符
        //1，创建文件字符输入流
        FileReader fr = new FileReader("Day010/test01/test02.txt");
        //2，读取字符
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }

        //3 关闭
        fr.close();
        */

        //读取多个字符
        //1，创建文件字符输入流
        FileReader fr = new FileReader("Day010/test01/test02.txt");
        //2，读取字符
        char[] buf = new char[3]; //保存读取的字符数据，水杯
        int len;
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }
        //3 关闭
        fr.close();
    }
}
