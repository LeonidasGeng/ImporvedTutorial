package com.itheima.demo04包装类_重点;

/*
目标:学习Integer和int之间的转换

讲解:
    int -> Integer
        static Integer valueOf​(int i)

    Integer -> int
        int intValue​()

目标:学习自动装箱和自动拆箱
    包装类相当于是箱子
    自动装箱: 将基本数据类型转成包装类
    自动拆箱: 将包装类转成基本数据类型
    自动装箱和自动拆箱目的是简化代码
 */
public class Demo042 {
    public static void main(String[] args) {
        // int -> Integer: 装箱 (把苹果放到箱子里面)
        // static Integer valueOf​(int i)
        Integer i1 = Integer.valueOf(5); // 手动装箱
        System.out.println("i1 = " + i1);

        // Integer -> int: 拆箱 (把箱子拆开拿到里面的苹果)
        // int intValue()
        int i2 = i1.intValue(); // 手动拆箱

        // 自动装箱: 自动将基本数据类型转成包装类
        Integer i3 = 5; // Integer i3 = Integer.valueOf(5);

        // 自动拆箱: 将包装类转成基本数据类型
        int i4 = i3; // int i4 = i3.intValue();

        // 面试题: 自动装箱和自动拆箱的原理是什么?
        // 反编译工具.
        // 可以看到自动装箱底层使用: Integer i3 = Integer.valueOf(5);
        // 自动拆箱: int i4 = i3.intValue();

        Integer i5 = 2;
        i5 += 2; // 这句代码做了什么操作
        // i5 = i5 + 2;
        // i5 + 2: i5.intValue() + 2
        // i5 = i5 + 2: Integer.valueOf(i5.intValue() + 2)
        System.out.println("i5 = " + i5);
    }
}
