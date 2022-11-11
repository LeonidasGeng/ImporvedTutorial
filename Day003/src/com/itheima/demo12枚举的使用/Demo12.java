package com.itheima.demo12枚举的使用;

import java.util.Scanner;

/*
目标:学习枚举的定义和使用
    枚举是JDK1.5推出的新特性

    枚举的概念:
        一个一个地举出来。 列举某个类型的所有值, 性别只有男和女, 一个星期只有七天
        适合只类型有几个固定值的情况

    枚举的格式:
        enum 枚举名 {
            成员变量名1, 成员变量名2, 成员变量名3;
        }

        枚举中的成员变量名也称为"枚举项"

    枚举的使用:
        枚举名.成员变量名

    枚举的好处: 将来不能随便写数据,一定是从枚举中选择某一项

    枚举的应用场景:
        方向,季节,月份,小时

    扩展一下,网页中用户选择的数据怎么变成枚举
    让数字转成枚举
 */
public class Demo12 {
    public static void main(String[] args) {
        Person p = new Person("迪丽热巴", Gender.MALE);

        System.out.println(p.getName() + ", " + p.getSex());

        System.out.println("请输入性别,0表示男,1表示女");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        // 让数字转成枚举
        Gender value = Gender.values()[i];
        System.out.println("value = " + value);
    }
}
