package com.itheima.demo15toString方法_重点;

import java.util.ArrayList;

/*
目标:学习toString方法的作用

讲解:
    Object类中默认的toString方法返回?
        包名.类名@地址 com.itheima.demo15toString方法_重点.Person@4554617c

    我们觉得打印对象的地址意义不大好,子类可以重写父类的toString()打印对象的成员变量

    我们打印对象时想显示对象的成员变量怎么办?
        子类可以重写父类的toString()
        使用快捷键: alt + insert -> toString()

    了解:一般Java自定义的类都是重写了toString();
 */
public class Demo15 {
    public static void main(String[] args) {
        Person p = new Person("古力娜扎", 18);
        // 打印对象
        System.out.println(p); // 打印对象就是调用对象的toString()进行打印
        System.out.println(p.toString());

        // 重写toString

        // 演示Java自定义类重写了toString()
        String str = new String("aaa");
        System.out.println(str.toString());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(33);
        list.add(22);

        System.out.println(list);
        System.out.println(list.toString());
    }