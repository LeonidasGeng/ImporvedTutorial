package com.itheima.demo05Date类_重点;

import java.util.Date;

/*
目标:学习Date类的使用

讲解
    Date类的说明:
        Date类代表了一个特定的时间(2021年2月1日 11时59分 38秒)，精确到毫秒。

        1秒 = 1000毫秒
        参照: 1970年1月1日 0时0分0秒 (通常电子产品都参照这个时间)

    Date类构造方法:
        Date​() 创建Date对象,时间为执行这行代码的时间(当前时间)
        Date​(long date) 创建Date对象,时间是在 1970年1月1日 0时0分0秒 基础上增加参数指定的毫秒值

    Date类普通方法:
        long getTime​() 得到当前对象的时间 和 1970年1月1日 0时0分0秒 相差的毫秒值
        void setTime​(long time) 修改时间, 时间是在 1970年1月1日 0时0分0秒 基础上增加参数指定的毫秒值
 */
public class Demo05 {
    public static void main(String[] args) {
        // Date(): // 创建Date对象,时间是当前时间
        Date date = new Date();
        System.out.println("date = " + date);

        // Date​(long date) // 在标准时间 1970年1月1日 0时0分0秒基础上加上指定的毫秒值
        Date date2 = new Date(2000);
        System.out.println("date2 = " + date2);

        // long getTime​() 获取日期和 1970年1月1日 0时0分0秒之间毫秒值
        System.out.println("getTime: " + date.getTime()); // 1647501454424

        // void setTime​(long time) 了解, 在标准时间 1970年1月1日 0时0分0秒基础上加上指定的毫秒值
        date.setTime(2000);
        System.out.println("date = " + date); // Thu Jan 01 08:00:03 CST 1970
    }
}
