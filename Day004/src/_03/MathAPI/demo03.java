package _03.MathAPI;
/*
API
application programming interface
应用程序        编程       接口
应用程序编程接口

以前使用的API
Scanner,Random,String,ArrayList
使用：
创建对象，调用方法
Scanner sc = new Scanner(System.in);
math类常用方法


 */
public class demo03 {
    public static void main(String[] args) {
        //abs(int a), absolute, 绝对值
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));
        System.out.println("=====");

        //ceil(double a), ceil(天花板), 向上取整, 取大一点的整数
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.7));
        System.out.println("=====");

        //floor(double a), floor(地板), 向下取整, 取小一点的整数
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));
        System.out.println("=====");

        //pow(double a, double b), a的b次方
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,10));
        System.out.println(Math.pow(4,5));
        System.out.println("=====");

        //round(double a), round, 四舍五入
        System.out.println(Math.round(8.1));
        System.out.println(Math.round(8.49));
        System.out.println(Math.round(8.5));
        System.out.println(Math.round(8.51));
        System.out.println(Math.round(8.9));


    }
}
