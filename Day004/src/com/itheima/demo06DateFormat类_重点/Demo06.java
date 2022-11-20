package com.itheima.demo06DateFormat类_重点;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标:学习DateFormat类的常用方法

讲解:
    1.为什么要DateFormat类:
		Date主要表示1970年到某个时间的毫秒值,如果输出给用户看,用户是看不太懂的:
		"Thu Oct 25 21:41:33 CST 2018"
        用户实际上比较喜欢"2018年10月25日 21时41分33秒"

    2.DateFormat类的作用:
        格式化（即日期文本） 将Date对象转成文字
        解析（文本日期） 将文字转成Date对象

    3.创建DateFormat对象: 是抽象类,使用子类SimpleDateFormat

    4.需求:将 当前时间的Date对象 转成 "2018年9月15日 19时18分19秒"

    5.为什么要将字符串转成Date对象
        例如网站注册用户选择的年月日是一个字符串.需要将他转成Date保存到数据库中

    6.需求:将字符串 "2007-12-26 10:13:31" 转成 Date对象

    指定时间格式:
        1.明确目标格式: "2018年9月15日 19时18分19秒"
        2.不会变化的固定不动
        3.会变化的使用特殊字母代替
 */
public class Demo06 {
    public static void main(String[] args) throws ParseException {
        // 需求:将当前时间的Date对象 转成 "2018年9月15日 19时18分19秒" (格式化)
        // 1.创建Date对象
        Date date = new Date();
        // 2.创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd87uui8888日 HH时mm分ss秒");
        // 3.调用格式化方法
        String format = sdf.format(date);
        System.out.println("格式化后的时间: " + format); // 2022/3/17 下午3:38   2022年03月17日 15时42分48秒

        // 需求:将字符串 "2007-12-26 10:13:31" 转成 Date对象 (解析)
        // 1.创建时间字符串
        String str = "2007-12-26 10:13:31";
        // 2.创建SimpleDateFormat对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 3.调用解析方法
        Date parse = sdf2.parse(str); // parse方法会有红色的波浪线, alt + 回车 -> 第一个
        System.out.println("解析后 = " + parse);
    }
}