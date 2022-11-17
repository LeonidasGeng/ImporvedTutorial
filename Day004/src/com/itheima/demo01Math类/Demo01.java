package com.itheima.demo01Math类;

/*
目标:能够掌握Math类的使用

Math介绍:
    数学类,他里面的方法都是数学相关的操作
    这个类将构造方法私有了,我们不能创建对象,他里面的方法都是static方法,直接使用类名调用即可

Math类方法:
    public static int abs​(int a) 获取绝对值 absolute
    public static double ceil​(double a) 向上取整, 取更大一点的整数
    public static double floor​(double a) 向下取整, 取小一点的整数
    public static double pow​(double a, double b) a的b次方
    public static long round​(double a) 四舍五入
 */
public class Demo01 {
    public static void main(String[] args) {
        // public static int abs​(int a) 获取绝对值 absolute
        System.out.println(Math.abs(5)); // 5
        System.out.println(Math.abs(-5)); // 5

        // public static double ceil​(double a) 向上取整, 取更大一点的整数
        System.out.println(Math.ceil(5.1)); // 6.0
        System.out.println(Math.ceil(5.7)); // 6.0

        // public static double floor​(double a) 向下取整, 取小一点的整数
        System.out.println(Math.floor(5.1)); // 5.0
        System.out.println(Math.floor(5.7)); // 5.0

        // public static double pow​(double a, double b) a的b次方
        System.out.println(Math.pow(2, 3)); // 2的3次方  2*2*2
        System.out.println(Math.pow(2, 10)); // 2的10次方  2*2*2*2*2*2*2*2*2*2 = 1024

        // public static long round​(double a) 四舍五入
        System.out.println(Math.round(5.1)); // 5
        System.out.println(Math.round(5.7)); // 6
        System.out.println(Math.round(5.5)); // 6
    }
}
