package _06.exists_and_is;

import java.io.File;

public class demo06 {
    public static void main(String[] args) {
        //1,创建一个file，定位到文件
        File file1 = new File("C:\\Software\\MyFileTest\\test01.txt");;

        //2,创建一个file，定位到文件夹
        File file2 = new File("C:\\Software\\MyFileTest\\小李的测试文件夹03");

        //2,创建一个file，定位到文件夹
        File file3 = new File("C:\\Software\\MyFileTest\\小李的测试文件夹04");

        //boolean isDirectory() 是否是文件夹，如果是文件夹返回true
        System.out.println(file1.isDirectory());
        System.out.println(file2.isDirectory());

        //boolean isFile() 是否是文件，如果是文件，返回true
        System.out.println(file1.isFile());
        System.out.println(file2.isFile());

        ////boolean exists() 是否存在，如果是，返回true
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        System.out.println(file3.exists()); //实际并不存在


    }
}
