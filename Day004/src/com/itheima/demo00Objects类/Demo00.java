package com.itheima.demo00Objects类;

import com.itheima.demo00equals方法_重点.Teacher;

import java.util.Objects;

/*
目标:学习Objects类中的常用方法

讲解:
    一般来说类名后面带s都是工具类,里面会提供一些静态方法帮助我们操作某些对象
    Arrays数组工具类,他里面有很多操作数组的方法

    Objects介绍:
        是JDK1.7提供的类, 他里面有很多静态方法帮助我们操作对象

    Objects类中:
        public static boolean equals​(Object a, Object b) 判断a和b是否相同,本质a.equals(b)
        public static boolean isNull​(Object obj) 判断是否为null,如果为null返回true
 */
public class Demo00 {
    public static void main(String[] args) {
        Teacher t1 = null;
        Teacher t2 = new Teacher("刘老师", 19);

        // 比较对象的内容
        // System.out.println(t1.equals(t2)); // NullPointerException: 空指针异常

        // 本质是t1.equals(t2),但是会判断t1是否为null,避免空指针异常
        System.out.println(Objects.equals(t1, t2));

        // public static boolean isNull​(Object obj) 判断是否为null,如果为null返回true
        System.out.println(Objects.isNull(t1)); // true
        System.out.println(Objects.isNull(t2)); // false

        /*
            class Objects {
                public static boolean equals(Object a, Object b) {
                    // a: t1    b: t2
                    // a != null && a.equals(b): 如果a != null, 就调用 a.equals(b), 如果a是null,不执行 a.equals(b)
                    return (a == b) || (a != null && a.equals(b));
                    return (t1 != null && t1.equals(t2));
                }
            }
         */


        // 以前比较字符串内容
        String str1 = "hello";
        String str2 = "hello";
        // System.out.println(str1.equals(str2));
        // 本质是str1.equals(str2),但是会判断str1是否为null,避免空指针异常
        System.out.println(Objects.equals(str1, str2));
    }
}