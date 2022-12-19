package _08.DateClasses.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
SimpleDateFormat
对Date对象，进行格式化和解析

格式化
Date对象==>2020年01月01日 02：03：04

解析
2020年01月01日 02：03：04 ==> Date对象

Date类时间格式
y   年
M   月
d   日
H   小时
m   分
s   秒

 */
public class demo081 {
    public static void main(String[] args) throws ParseException {
        //需求：将当前时间Date对象 转换为 "xxxx年xx月xx日 xx时xx分xx秒"(格式化)
        //1，创建Date对象
        Date date = new Date();
        //2，创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //3，调用格式化方法
        String format = sdf.format(date);
        System.out.println("格式化后的时间" + format);


        //需求：将字符串"2007-12-26 10:13:31" 转成Date对象(解析)
        //1，创建时间字符串
        String str = "2007-12-26 10:13:31";
        //2，创建SimpleDateFormat对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //3，调用解析方法
        Date parse = sdf2.parse(str); //parse方法有红色波浪线，alt+回车，选择add……signiture;
        System.out.println("解析后 = "+parse);
    }
}
