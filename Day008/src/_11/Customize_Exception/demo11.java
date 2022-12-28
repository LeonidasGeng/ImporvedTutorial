package _11.Customize_Exception;

import java.util.Scanner;

/*
某些异常不符合我们的需求
根据具体业务来定义异常类

让控制台报错更方便理解

方法：
    1，自定义类继承Exception或RuntimeException(extends Exception)
    2，定义无参和带String的构造方法

需求：
    模拟网站注册，如果用户年龄小于18，不能注册

步骤：
    1，定义类继承Exception/RuntimeException
    2，编写构造器

 */
public class demo11 {
    //模拟网站注册，如果用户年龄小于18不能注册
    public static void main(String[] args) {
        //模仿已有异常 NullPointerException

        //1，让用户输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();

        //2，注册
        try {
            register(name, age);
        } catch (U18Exception e) {
            System.out.println("你的年龄太小了，请长大后再浏览");
        }

        System.out.println("程序接着运行");

    }

    private static void register(String name, int age) throws U18Exception {
        if (age<18) {
            //制造/创建异常，自己出的问题，抛给别人处理
            throw new U18Exception("年龄小于18"); //选择throws
        }else{
            System.out.println("注册成功，请尽情浏览");
        }
    }


}
