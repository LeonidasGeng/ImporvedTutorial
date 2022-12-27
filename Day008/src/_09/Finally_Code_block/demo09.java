package _09.Finally_Code_block;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
try……catch……finally
放在finally里的代码块一定被执行

try{
    可能出现异常的代码
}catch(异常类名 变量名){
    异常的处理代码
}finally{
    需要执行的代码
}
 */
public class demo09 {
    public static void main(String[] args) {
        test01();
        System.out.println("====================");
        test02();
        System.out.println("====================");
        test03();
    }

    public static void test01() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1 = sdf.parse("2022-2-22 22:22:22");
            System.out.println(d1);
        } catch (ParseException e) {
            System.out.println("处理了异常");
        } finally {
            System.out.println("我是Finally，我一定执行");
        }
        System.out.println("我显示了吗？");
    }


    public static void test02() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //                             👇故意出错
            Date d1 = sdf.parse("2022年2-22 22:22:22");
            System.out.println(d1);
        } catch (ParseException e) {
            System.out.println("处理了异常");
        } finally {
            System.out.println("我是Finally，我一定执行");
        }
        System.out.println("我显示了吗？");
    }
    public static void test03() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //                             👇故意出错
            Date d1 = sdf.parse("2022年2-22 22:22:22");
            System.out.println(d1);
        } catch (ParseException e) {
            System.out.println("处理了异常");
            return;
        } finally {
            System.out.println("我是Finally，我一定执行");
        }
        System.out.println("我显示了吗？");
    }
}
