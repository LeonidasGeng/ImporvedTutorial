package _01.File_Constructor;

import java.io.File;

/*
File class
作用
    java.io.File代表操作系统的文件/文件夹对象
    通过File对象操作文件和文件夹

新建
删除
看文件/文件夹信息（属性）

File类有好多构造器
最主要的有3个

    1, File(String pathname)  File(D:\2022年8月线下完结JAVAEE课程\02阶段JAVA进阶(每天看3个)\day10-File、递归、IO流\2-讲义)

在window里，//和\\都可以
//字符串里黏贴，自动打上双\\，如果没有自己要添加

 */
public class demo01 {
    public static void main(String[] args) {
        //1,File(String pathname)  File(D:\2022年8月线下完结JAVAEE课程\02阶段JAVA进阶(每天看3个)\day10-File、递归、IO流\2-讲义)
        //字符串里黏贴，自动打上双\\，如果没有自己要添加
        File file1 = new File("C:\\Software\\MyFileTest");
        //File file1 = new File("C://Software//MyFileTest");
        System.out.println("File1 = "+file1);

        //2, File(String parent, String child) 通过父路径和子路径创建File对象
        File file2 = new File("C:\\Software","MyFileTest");
        //File file2 = new File("C://Software","MyFileTest");
        System.out.println("File2 = "+file2);

        //3,File(File parent, File child) 通过父路径File对象和子路径创建File对象
        File parent = new File("C:\\Software");
        File file3 = new File(parent, "MyFileTest");
        //File parent = new File("C://Software");
        //File file3 = new File(parent, "MyFileTest");
        System.out.println("file3 = "+file3);
    }
}
