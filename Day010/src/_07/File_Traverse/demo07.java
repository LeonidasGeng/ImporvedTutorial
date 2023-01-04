package _07.File_Traverse;

import java.io.File;
/*
如果是文件，不能用listFiles()，不然会报错
空指针异常
 */
public class demo07 {
    public static void main(String[] args) {
        //创建一个file对象
        File file1 = new File("C:\\Software\\MyFileTest");

        //public File[] listFiles() 获取(显示)文件夹中的内容
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("====================");
        //返回文件名 list()
        String[] names = file1.list();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
