package _10.Find_All_Java_File;

import java.io.File;

/*
搜索某个文件夹中所有的java文件，如果文件夹中有文件，也要找出来

方法
    1，创建一个File对象表示aaa文件夹
    2. 定义一个方法listJava(File dir), 列出某个文件夹所有java文件
    3，遍历获取每个内容
    4，如果时文件，且是java文件，打印这个文件
    5，如果是文件夹，再次调用listJava
 */
public class demo10 {
    public static void main(String[] args) {
        //1，创建一个File对象表示aaa文件夹
        File file = new File("C:\\Software\\MyFileTest");

        listJava(file);
    }

    //    2. 定义一个方法listJava(File dir),
    public static void listJava(File dir) {
        //2.1 调用listFiles()显示文件夹中所有的内容
        File[] files = dir.listFiles();
        //2.2 遍历获取每个内容
        for (File file : files) {
            if (file.isFile()) {
                //2.3.1 如果是文件，且是java文件，打印这个文件
                if (file.getName().endsWith(".java")) {
                    System.out.println(file);
                }
            }
            else {
                //2.3.2 如果是文件夹，再次调用listJava
                listJava(file);
            }
        }
    }
}


