package com.itheima.demo09日期类练习2_计算活了多少天;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 小贾出生日期为2000年11月11日，请计算小贾活了多少天了！
public class Demo09 {
    public static void main(String[] args) throws ParseException {
        // 1.得到现在时间
        Date now = new Date();
        // 2.把现在时间转成毫秒值
        long nowTime = now.getTime(); // 现在的毫秒值

        // 3.把小贾出生日期转成毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday = sdf.parse("1986年4月26日");
        long birthdayTime = birthday.getTime(); // 出生的毫秒值

        // 4.小贾活着的毫秒值 = 现在时间毫秒值 - 小贾出生毫秒值
        long liveTime = nowTime - birthdayTime;

        // 5.把小贾活着的毫秒值 转成天
        //            毫秒     秒   分钟  小时  天
        long day = liveTime / 1000 / 60 / 60 / 24;
        System.out.println("活着的天数: " + day);
    }
}
