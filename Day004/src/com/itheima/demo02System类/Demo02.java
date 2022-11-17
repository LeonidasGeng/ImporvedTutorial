package com.itheima.demo02System类;

import java.util.Arrays;
import java.util.Scanner;

/*
目标:学习System类中的常用方法

讲解:
    System类说明:
        表示系统类

    System类普通方法:
        public static void exit​(int status) 退出JVM虚拟机,停止程序
        public static long currentTimeMillis​() 获取当前时间的毫秒值
        public static void arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)
 */
public class Demo02 {
    public static void main(String[] args) {
        // System.out.println("a");
        // System.exit(0); // 退出JVM虚拟机,停止程序
        // System.out.println("b");

        // public static long currentTimeMillis​() 获取当前时间的毫秒值, 从1970年1月1号 0时0分0秒
        // 作用: 统计代码的耗时
        long start = System.currentTimeMillis(); // 开始时间
        System.out.println("开始时间: " + start);

        for (int i = 0; i < 100000000; i++) {
        }

        long end = System.currentTimeMillis(); // 结束时间
        System.out.println("耗时: " + (end - start)); // 21毫秒

        // public static void arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)
        // 复制数组
        // Object src: 源数组
        // int srcPos: 从源数组哪个位置开始
        // Object dest: 目标数组,拷贝后的数组
        // int destPos: 放在目标数组哪个位置开始
        // int length: 拷贝的数量
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // 效果:     {0, 0, 0, 11, 22, 33, 44, 55 0, 0};
        System.arraycopy(arr1, 0, arr2, 3, arr1.length);

        // 打印复制后的数组, 想看数组的内容
        // Arrays.toString(arr2): 把数组的内容拼接成一个字符串
        System.out.println(Arrays.toString(arr2));
    }
}
