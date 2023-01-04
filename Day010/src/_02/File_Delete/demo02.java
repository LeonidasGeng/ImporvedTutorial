package _02.File_Delete;

import java.io.File;

/*
public boolean delete() 删除文件或文件夹

直接删除(格式化)，不走回收站，不可撤回
如果是一个文件，直接删除
如果是一个文件夹，需要先删除文件夹中的内容，最后才能删除文件夹

//字符串里黏贴，自动打上双\\，如果没有自己要添加

 */
public class demo02 {
    public static void main(String[] args) {
        //定位文件
        //1，boolean delete() 可以删除文件，删除成功返回true
        File file1 = new File("C:\\Software\\MyFileTest\\test1\\test1.txt");
        System.out.println(file1.delete());

        //2，boolean delete() 删除空文件夹
        File file2 = new File("C:\\Software\\MyFileTest\\test3"); //空文件夹，返回true
        System.out.println("file2.delete()");
        File file3 = new File("C:\\Software\\MyFileTest\\test2"); //里面有文件，需要删除后才能删除文件夹，返回false
        System.out.println("file3.delete()");
    }
}
