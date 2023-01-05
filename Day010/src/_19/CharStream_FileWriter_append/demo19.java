package _19.CharStream_FileWriter_append;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter(String name) 文件不存在会创建文件，会覆盖以前的数据
FileWriter(File file) 文件不存在会创建文件，会覆盖以前的数据

追加续写
FileWriter(String name, booolean append) append为true，在已有内容后面接着写数据
FileWriter(File file, booolean append) append为true，在已有内容后面接着写数据

换行
\r\r：表示换行
要写成write("\r\n")

 */
public class demo19 {
    public static void main(String[] args) throws IOException {
        //如果没有文件，会创建文件
        //如果已有文件，会覆盖以前的数据
        /*
        //每次运行，都会覆盖之前的（删除之前的）
        FileWriter fw = new FileWriter("Day010/test01/test04.txt");
        fw.write("hello");//hello
        fw.write("\r\n");
        fw.write("world");//helloworld
        fw.close();
         */
        ////每次运行，都会在之前的基础上添加（删除之前的）
        FileWriter fw = new FileWriter("Day010/test01/test05.txt",true);
        fw.write("hello");//hello
        fw.write("\r\n");
        fw.write("world");//hello world
        fw.write("\r\n");
        fw.write("hello");//hello world hello
        fw.write("\r\n");
        fw.write("world");//hello world hello world
        fw.close();
    }
}
