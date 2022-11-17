package com.itheima.demo08日期类练习1_秒杀案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
秒杀开始时间: 2020年11月11日 00:00:00
秒杀结束时间: 2020年11月11日 00:10:00

小贾下单并付款的时间为：
	2020年11月11日 0:03:47
小皮单并付款的时间为：
	2020年11月11日 0:10:11

用代码说明这两位同学有没有参加上秒杀活动?

把秒杀开始时间转成毫秒值
把秒杀结束时间转成毫秒值
把小贾下单时间转成毫秒值
如果小贾下单时间毫秒值在开始和结束秒杀时间内,说明秒杀成功

核心思路就是将时间字符串转成毫秒值,对比下单的毫秒值是否在秒杀开始和结束的毫秒值范围内

将时间字符串 "2020年11月11日 00:00:00" -> 毫秒值,不能一步到位
"2020年11月11日 00:00:00" 解析为 Date对象  -> Date对象调用getTime() 得到毫秒值

 */
public class Demo08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        // 把秒杀开始时间转成毫秒值
        Date startDate = sdf.parse("2020年11月11日 00:00:00");
        long startTime = startDate.getTime(); // 开始的毫秒值

        // 把秒杀结束时间转成毫秒值
        Date endDate = sdf.parse("2020年11月11日 00:10:00");
        long endTime = endDate.getTime(); // 结束的毫秒值

        // 把小贾下单时间转成毫秒值
        Date xiaoJiaDate = sdf.parse("2020年11月11日 0:03:47");
        long xiaoJiaTime = xiaoJiaDate.getTime(); // 小贾的下单时间毫秒值

        // 如果小贾下单时间毫秒值在开始和结束秒杀时间内,说明秒杀成功
        if (xiaoJiaTime >= startTime && xiaoJiaTime <= endTime) {
            System.out.println("小贾秒杀成功!");
        } else {
            System.out.println("小贾秒杀失败!");
        }

        // 把小皮下单时间转成毫秒值
        Date xiaoPiDate = sdf.parse("2020年11月11日 0:10:11");
        long xiaoPiTime = xiaoPiDate.getTime();

        // 如果小皮下单时间毫秒值在开始和结束秒杀时间内,说明秒杀成功
        if (xiaoPiTime >= startTime && xiaoPiTime <= endTime) {
            System.out.println("小皮秒杀成功!");
        } else {
            System.out.println("小皮秒杀失败!");
        }
    }
}
