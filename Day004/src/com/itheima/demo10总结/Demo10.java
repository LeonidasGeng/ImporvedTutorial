package com.itheima.demo10总结;

/*
能够重写Object类的equals方法
    Object类的equals方法默认是比较对象的地址
    我们可以重写equals方法比较对象内容
    快捷键: alt + insert -> equals() and hashCode() 删除 hashCode()方法

能够使用System类获取当前系统毫秒值
    System.currentTimeMillis();

能够将基本类型转换为对应的字符串
    int -> String       5 -> "5"
    String str1 = 5 + ""; // "5"
    String str2 = String.valueOf(5); // "5"

能够将字符串转换为对应的基本类型
    String转成int         "5" -> 5
    int i = Integer.parseInt("5");

能够说出自动装箱、自动拆箱的概念
    自动装箱: 自动把基本数据类型转成包装类
    自动拆箱: 自动把包装类转成基本数据类型

能够使用日期类输出当前日期
    Date d = new Date();
    System.out.println(d);

能够使用将日期格式化为字符串的方法
    将当前时间的Date对象 转成 "2018年9月15日 19时18分19秒" (格式化)
    SimpleDateFormat类:
        String format(Date d);

能够使用将字符串转换成日期的方法
    将字符串 "2007-12-26 10:13:31" 转成 Date对象 (解析)
    SimpleDateFormat类:
        Date parse(String s)

能够使用Calendar类的get、set、add方法计算日期
    int get(int filed): 获取指定单位的时间
    set(int field, int value): 修改时间, 设置的值是多少就是多少,绝对修改
    add(int field, int value): 添加或减去时间, 设置的值会根据日历的规则调整,相对的修改

学习API不要死记硬背
理解性的学习API

API两个步骤
1.创建对象
2.调用方法

知道类有什么用,知道功能中文名,不要记方法名和参数和返回值类型,通过IDEA提示即可
测试
 */
public class Demo10 {
    public static void main(String[] args) {
        // "5" -> 5
    }
}
