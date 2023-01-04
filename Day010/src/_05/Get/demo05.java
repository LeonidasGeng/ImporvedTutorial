package _05.Get;

import java.io.File;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        //1,创建一个file，定位到文件
        File file1 = new File("C:\\Software\\MyFileTest\\test01.txt");;
        boolean newFile1 = file1.createNewFile();
        //2,创建一个file，定位到文件夹
        File file2 = new File("C:\\Software\\MyFileTest\\小李的测试文件夹03");
        boolean newFile2 = file2.mkdir();


        //3, 获取绝对路径 String getAbsolutePath()
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file2.getAbsoluteFile());

        //4, 获取名字 String getName() 路径中最后一个\\右边
        System.out.println(file1.getName());
        System.out.println(file2.getName());

        //4, 获取名字 String getParent() 路径中最后一个\\左边
        System.out.println(file1.getParent());
        System.out.println(file2.getParent());

        //5, 获取文件大小（字节）， 文件夹无法获取准确大小
        // long length()
        System.out.println(file1.length());
        System.out.println(file2.length());

    }
}
