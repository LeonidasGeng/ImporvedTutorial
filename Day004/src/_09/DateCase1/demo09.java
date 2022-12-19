package _09.DateCase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
秒杀案例
小李下单并付款时间为
2022年11月11日 00:03:47

小胡下下单并付款的时间为
2022年11月11日 00:10:27

用代码说明这两位客户有没有参加上秒杀活动

秒杀时间为
开始：2022年11月11日 00:00:00
结束：2022年11月11日 00:10:00

思路
1，把秒杀开始时间转成毫秒值
2，把秒杀结束时间转成毫秒值
3，把他们俩的下单时间并付款的时间转成毫秒值
4，对比，在范围内，就是表示秒杀成功



*/
public class demo09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //1，把秒杀开始时间转成毫秒值
        Date startDate = sdf.parse("2022年11月11日 00:00:00");
        long startTime = startDate.getTime();

        //2，把秒杀结束时间转成毫秒值
        Date endDate = sdf.parse("2022年11月11日 00:10:00");
        long endTime = endDate.getTime();

        //3，把小胡和小李的时间转成毫秒值
        //3.1，把小李下单并付款时间转成毫秒值
        Date liDate = sdf.parse("2022年11月11日 00:03:47");
        long liTime = liDate.getTime();
        //3.2，把小胡下单并付款时间转成毫秒值
        Date huDate = sdf.parse("2022年11月11日 00:10:27");
        long huTime = huDate.getTime();

        //4，判断
        //4.1，小李是否秒杀成功？
        if (liTime>startTime && liTime<endTime) {
            System.out.println("小李秒杀成功");
        }else {
            System.out.println("小李秒杀失败");
        }
        //4.2，小李是否秒杀成功？
        if (huTime>startTime && huTime<endTime) {
            System.out.println("小胡秒杀成功");
        }else {
            System.out.println("小胡秒杀失败");
        }
    }
}
