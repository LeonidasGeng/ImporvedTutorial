package _08.Principles_For_Handling_Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static _07.Fix_Exception.demo07_02.test02;

/*
处理异常的原则

    不要把异常抛给JVM虚拟机
    1, 直接try/catch
    2, 2.1先抛出，2.2再try/catch方法


 */
public class demo08 {
    public static void main(String[] args) {
        test01();

        //2.2
        try {
            test02();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //1， 直接try/catch
    public static void test01()  {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1 = sdf.parse("2022-2-22 22:22:22");
            System.out.println(d1);
        } catch (ParseException e) {
            System.out.println("我处理了异常");
        }
    }

    //2.1 先抛出异常
    public static void test02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse("2022-2-22 22:22:22");
        System.out.println(d1);
    }
}
