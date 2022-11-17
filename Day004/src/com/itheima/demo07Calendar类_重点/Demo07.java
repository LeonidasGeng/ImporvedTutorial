package com.itheima.demo07Calendar类_重点;

import java.util.Calendar;

/*
目标:学习Calendar类的常用方法

讲解:
    1.Date类的缺点
		Date主要是表示1970的毫秒值,Date类对单独获取年,月,日,时,分,秒,昨天,明天,上个星期,加上或减去一些时间不好处理

	2.Calendar的作用
	    方便调整时间

	3.如何创建Calendar对象
	    Calendar rightNow = Calendar.getInstance();

	4.Calendar类常用方法
	    int get​(int field) 返回给定日历字段的值。
	    void set​(int field, int value) 将给定的日历字段设置为给定的值。
        void add​(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段。

	5.Calendar注意事项
        MONTH是从0开始的
        0   表示1月
        1   表示2月
        ...
        10  表示11月
        11  表示12月
 */
public class Demo07 {
    public static void main(String[] args) {
        // 1.获取Calendar
        // Calendar cal = Calendar.getInstance(); // 创建Calendar子类,设置很多时间相关的数据
        // System.out.println("cal = " + cal);

        // 2.操作Calendar
        // test01();
        // test02();
        test03();
    }

    // public void add​(int field, int amount) 相对的修改时间,在当前日期对象上添加或减去指定的时间
    // int field: 时间单位
    // int amount: 增加或减去的值
    public static void test03() {
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        // cal.add(Calendar.YEAR, 10); // 10年后
        // cal.add(Calendar.YEAR, -10); // 10年前

        cal.add(Calendar.DAY_OF_MONTH, -1000);// 1000天前

        System.out.println("调整后 = " + cal);
    }

    // public void set(int field, int value): 绝对修改,你写多少就是多少
    // int field: 时间单位
    // int value: 修改的值
    public static void test02() {
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        // 修改年
        // cal.set(Calendar.YEAR, 2025);
        // 修改日
        // cal.set(Calendar.DAY_OF_MONTH, 3);

        // 一次改多个值
        cal.set(2023, 5, 1, 12, 13, 14);

        System.out.println("修改后 = " + cal);
    }

    // public int get​(int field) 获取时间
    public static void test01() {
        // 获取Calendar
        Calendar cal = Calendar.getInstance(); // 当前时间

        // 获取年          时间单位
        int year = cal.get(Calendar.YEAR);
        System.out.println("year = " + year);
        // 获取月
        int month = cal.get(Calendar.MONTH);
        System.out.println("month = " + month); // 2 月份从0开始的,表示3月
        // 获取日
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("day = " + day);
        // 获取小时
        int hour = cal.get(Calendar.HOUR);
        System.out.println("hour = " + hour);
    }
}