package _08.DateClasses;
/*
处理时间
标准时间GMT
1970年1月1日 00：00：00 GMT （本初子午线）

中国时间：世界标准时间 + 8 hr

1秒=1000毫秒
1毫秒=1000微秒
1微秒=1000纳秒

public Date() 创建一个Date对象，表示当前时间
public Date(long date)


 */


import java.util.Date;

public class demo08 {
    public static void main(String[] args) {
        //Date(); 创建Date对象，时间是执行这行代码的时间
        Date date = new Date();
        System.out.println("Date = " + date);

        //Date(long date) 在标准时间1970年1月1日 0时0分0秒基础上加上指定的毫秒值
        Date date1 = new Date(2888);
        System.out.println("Date1 = " + date1);

        //long getTime() 获取现在和1970年1月1日 0时0分0秒之间的毫秒值
        System.out.println("getTime: "+date.getTime());

        //void setTime(long time) 在标准时间1970年1月1日 0时0分0秒基础上加上指定的毫秒值
        date.setTime(3000);
        System.out.println("date = "+date);
    }
}
