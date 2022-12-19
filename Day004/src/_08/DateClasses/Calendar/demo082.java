package _08.DateClasses.Calendar;

import java.util.Calendar;

/*
Calendar作用
表示日历，方便修改时间

用getInstance
 */
public class demo082 {
    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        System.out.println("cal="+cal);
        test01();
        test02();
        test03();

    }
    public static void test01(){
        Calendar cal1 = Calendar.getInstance();
        //  获取年       时间单位
        int year = cal1.get(1);
        System.out.println("year="+year);
        //获取月
        int month = cal1.get(Calendar.MONTH);
        System.out.println("month="+month);
        //获取日
        int day = cal1.get(Calendar.DAY_OF_MONTH);
        System.out.println("month="+ day);
        //获取小时
        int hour = cal1.get(Calendar.HOUR_OF_DAY);
        System.out.println("hour="+hour);
        //获取分
        int minute = cal1.get(Calendar.MINUTE);
        System.out.println("minute="+minute);
        //获取秒
        int second = cal1.get(Calendar.SECOND);
        System.out.println("second="+second);
        //获取毫秒
        int millisecond = cal1.get(Calendar.MILLISECOND);
        System.out.println("millisecond="+millisecond);
    }

    //public void set(int field, int value) 绝对修改，你写多少就是多少
    //                时间单位      值
     public static void test02() {
        Calendar cal = Calendar.getInstance();
         System.out.println("cal="+cal);
         //修改年
         cal.set(Calendar.YEAR, 2025);
         //修改月
         cal.set(Calendar.MONTH, Calendar.JANUARY);
         //修改日
         cal.set(Calendar.DAY_OF_MONTH, 1);
         //修改时
         cal.set(Calendar.HOUR_OF_DAY, 14);

         //一次修改多个值
         cal.set(2024,12,31,23,33,15);

         System.out.println("修改后="+cal);

    }

    public static void test03() {

        Calendar cal = Calendar.getInstance();

        //10年后
        cal.add(Calendar.YEAR,10);

        //10年前
        cal.add(Calendar.MONTH,-10);

        //1000天前
        cal.add(Calendar.DAY_OF_MONTH,-1000);

        System.out.println("调整后="+cal);
    }

}
