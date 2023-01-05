package _18.CharStream_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
write(int c) 写一个字符
void write(char[] cbuf) 写一个字符数组到流中
void write(char[] cbuf, int off, int len) 写一个字符数组的一部分到流中
void write(String str) 写一个字符串到流中
void write(String str, int off, int len) 写一个字符串的一部分到流中

 */
public class demo18 {
    public static void main(String[] args) throws IOException {
        //创建文件字符输入流，让程序和文件建立了管道
        FileWriter fw = new FileWriter("Day010/test01/test03.txt");
        //write(int c) 写一个字符
        fw.write("呵");
        //void write(char[] cbuf) 写一个字符数组到流中
        char[] chs = new char[]{'我', '下', '有', '个', '你', '怕', '有', '啊'};
        fw.write(chs);
         //void write(char[] cbuf, int off, int len) 写一个字符数组的一部分到流中
        fw.write(chs, 3, 2);

        String str = "兰博基尼";
        //void write(String str) 写一个字符串到流中
        fw.write(str);
        //void write(String str, int off, int len) 写一个字符串的一部分到流中
        fw.write(str,2,2);
        fw.close();
    }
}
