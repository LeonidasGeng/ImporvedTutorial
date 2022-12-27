package _07.Fix_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
处理异常方式1
    1，throws，不负责任
    throws
    修饰符 返回值类型 方法名（参数） throws 异常类名1，异常类名2{

    }

作用：
    抛出异常，把异常抛给调用者处理

快捷键：
    alt+回车 -> 选择第一项

例子：
    SimpleDataFormate演示throws处理异常

表面处理异常，如果真的出现异常，这个异常会抛给调用者处理
 */
public class demo07_01 {
    public static void main(String[] args) throws ParseException {
        test01();
    }

    public static void test01() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse("2022-2-22 22:22:22");
        System.out.println(d1);
    }
}
