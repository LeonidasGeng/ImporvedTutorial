package _08._commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
commons-io
    是有关IO操作的类库，提高IO功能开发的效率

readFileToString(File file, String encoding) 读取文件中的数据，返回字符串
copyFile(File srcFile, File dstFile) 复制文件
copyDirectoryToDirectory(File dstFile, File src) 复制文件夹

 */
public class demo08 {
    public static void main(String[] args) throws IOException {
        //1 读取文件中的内容 readFileToString(File file, String encoding) 读取文件中的数据，返回字符串
        String str = FileUtils.readFileToString(new File("Day011/test_01/test01.txt"), "utf-8");
        System.out.println(str);
        //2 复制文件 copyFile(File srcFile, File dstFile)
        FileUtils.copyFile(new File("Day011/test_01/test01.txt"), new File("Day011/test_01/test01_01.txt"));
        //3 复制文件夹 copyDirectoryToDirectory()
        FileUtils.copyDirectoryToDirectory(new File("Day011/test_01"), new File("Day011/test_02"));
    }
}
