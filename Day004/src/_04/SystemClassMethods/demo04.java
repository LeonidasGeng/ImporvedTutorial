package _04.SystemClassMethods;

import java.util.Arrays;

/*
System
    表示系统类

public static void exit(int status) 退出JVM虚拟机，停止程序
public static long currentTimeMillis() 获取当前时间的毫秒值
public static void arraycopy(
 */
public class demo04 {
    public static void main(String[] args) {
//        System.out.println("a");
//        System.exit(0);//退出JVM虚拟机，停止程序
//        System.out.println("b");//不会显示

        //public static long currentTimeMillis(); 获取当前时间的毫秒值
        //从1970年1月1日0时0分0秒到现在的时间的毫秒值
        //一般拿来统计代码的耗时
        long start = System.currentTimeMillis();
        System.out.println("时间毫秒值"+start);

        for (int i = 0; i < 100000000; i++) {
//            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("程序耗时="+(start-end));

        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        //Object src:原数组（要拷贝的数组）
        //int srcPos:原数组开始位置
        //Object dest:目标数组（拷贝后的数组）
        //int destPos:目标数组开始位置
        //int length:拷贝数量/拷贝长度
        //复制数组
        //目标{0,0,0,11,22,33,44,55,0,0}
        int[] arr1= {11,22,33,44,55};
        int[] arr2= {0,0,0,0,0,0,0,0,0,0};;
        System.arraycopy(arr1,0,arr2,3,5);
        System.arraycopy(arr1,0,arr2,3, arr1.length);
        //打印复制后的数组，直接打印是数组的物理地址
        //要进行遍历
        System.out.println(arr2);//[I@10f87f48
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+",");
        }
        System.out.println("");
        //把数组内容拼接成字符串
        String str = Arrays.toString(arr2);
        System.out.println(str);




    }
}



