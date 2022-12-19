package _10.DateCase02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
计算小李活了多久

小李的出生时间为
1993年10月12日

分析
1，得到现在的时间
2，把现在的时间转成毫秒值
3，把小李的生日转成毫秒值
4，现在的时间-小李的生日=小李活了多少毫秒
5，小李活得天数=毫秒/60/60/60/24
 */
public class demo10 {
    public static void main(String[] args) throws ParseException {
        //1，现在的时间
        Date now = new Date();
        //2，把现在的时间转成毫秒值
        long nowTime = now.getTime();
        //3，把小李的生日转成毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date liBD = sdf.parse("1993年10月12日");
        long liBDTime = liBD.getTime();
        //4，小李活了多少毫秒=现在的时间毫秒值 - 小李出生的毫秒值
        long liveTime = nowTime - liBDTime;
        //5，小李活得天数= 毫秒/1000秒/60分/60时/24天
        long liLive = liveTime / 1000/60/60/24;
        System.out.println("小李活了"+liLive+"天");
    }
}
