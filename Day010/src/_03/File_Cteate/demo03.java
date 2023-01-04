package _03.File_Cteate;

import java.io.File;
import java.io.IOException;

/*
    1.boolean createNewFile() 创建新文件，true表示创建成功
    2.


 */
public class demo03 {
    public static void main(String[] args) throws IOException {
        //1.boolean createNewFile() 创建新文件，true表示创建成功
        File file1 = new File("C:\\Software\\MyFileTest\\小李的测试文件.txt");
        System.out.println(file1.createNewFile());

        //2.boolean mkdir() make directory 创建单级文件夹，true表示创建成功
        File file2 = new File("C:\\Software\\MyFileTest\\小李的测试文件夹01");
        System.out.println(file2.mkdir());

        //3.boolean mkdirs() make directories 创建多级文件夹，true表示创建成功
        //建议使用
        File file3 = new File("C:\\Software\\MyFileTest\\小李的测试文件夹02-1\\小李的测试文件夹02-2");
        System.out.println(file3.mkdirs());

    }
}
